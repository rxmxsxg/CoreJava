import java.util.ArrayList;

public class CollectionsObservations {

    /*
    ArrayList is the java.util package
    ArrayList is the growable array
    Default size of the ArrayList is the 0
    insertion order is preserved
    allows null values
    allows duplicates
     */
    private void arrayListObz() {

        var al = new ArrayList<>();
        al.add(1);
        al.add(9);
        al.add(5);
        al.add(3);
        al.add(5);
        al.add(null);
        System.out.println(al);
    }

    public static void main(String... args) {
        var c = new CollectionsObservations();
        c.arrayListObz();
    }
}
