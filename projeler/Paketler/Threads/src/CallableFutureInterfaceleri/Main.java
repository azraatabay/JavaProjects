package CallableFutureInterfaceleri;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

       /* executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();

                System.out.println("Thread çalışıyor...");
                int sure = random.nextInt(1000)+2000;
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread çıkıyor...");

            }
        });
        executor.shutdown();
        */
         Future<Integer> future = executor.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();

                System.out.println("Thread çalışıyor...");
                int sure = random.nextInt(1000)+2000;
                if(sure>2500){
                    throw new IOException("Thread çok uzun süre uyudu.");
                }
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread çıkıyor...");
                return sure;
            }
        });
        executor.shutdown();

        try {
            try {
                System.out.println("Dönen değer : "+ future.get());
            } catch (ExecutionException e) {
                System.out.println(e);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
