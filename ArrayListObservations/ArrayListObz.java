package ArrayListObservations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListObz implements Runnable {
    /*
    ArrayList not synchronized and not Thread safe
    Synchronization would add overhead reducing performance in scenarios
    where its unnecessary.

    Collections.synchronizedList(new ArrayList<>());
    need extra syncronize() method need to implement;

    CopyOnWriteArrayList<>() -> this is threadsafe
    =========================
    Thread-2 added: 0
Thread-2 added: 1
Thread-2 added: 2
Thread-2 added: 3
Thread-2 added: 4
Thread-1 added: 0
Thread-1 added: 1
Thread-1 added: 2
Thread-1 added: 3
Thread-1 added: 4
Thread-3 added: 0
Thread-3 added: 1
Thread-3 added: 2
Thread-3 added: 3
Thread-3 added: 4
Final List[0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4]
     */
    static List<Integer> al = new ArrayList<>();
//    static List<Integer> al = new CopyOnWriteArrayList<>();
//    static List<Integer> al = Collections.synchronizedList(new ArrayList<>());

    private static void syncTest() {
//        synchronized (al) {
        for (int i = 0; i < 5; i++) {
            al.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
//        }
        }
    }

    private static void asyncTest() {
        for (int i = 0; i < 5; i++) {
            al.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
        }
    }

    @Override
    public void run() {
        ArrayListObz.syncTest();
    }

    public List<Integer> getList() {
        return al;
    }

    public static void main(String... args) throws InterruptedException {
        ArrayListObz alo = new ArrayListObz();
        Thread t1 = new Thread(alo, "Thread-1");
        Thread t2 = new Thread(alo, "Thread-2");
        Thread t3 = new Thread(alo, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final List" + alo.getList());
        HashMap a = new HashMap();
    }
}
