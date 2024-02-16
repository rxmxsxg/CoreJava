import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"ramesh")
                .thenApply(String::toUpperCase);
        String s = future.get();
        System.out.println(s);
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()-> "gongura");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"ramesh");
        CompletableFuture<String> combined = future1.thenCombine(future2,(s1,s2)-> s1+s2);
                          String s11 =    combined.get();
        System.out.println(s11);
    }
}
