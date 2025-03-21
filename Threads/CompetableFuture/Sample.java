package Threads.CompetableFuture;

import java.util.concurrent.CompletableFuture;

public class Sample {
    public static void main(String[] args) {

        CompletableFuture<Void> future=CompletableFuture.supplyAsync(()->10).thenApplyAsync(x->x*2).thenAccept(x->System.out.println("Completed "+x));
        future.join();
    }
}
