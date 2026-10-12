package ThreadHavuzlari;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //Exevutors içindeki newFixedThreadPool a girdiğimiz 2 aynı anda en fazla çalışabilecek thread sayısını verir
        //bu havuzun kontrolu da executordadır.
        for (int i =1 ; i<=5 ; i++){
            executor.submit(new Worker(String.valueOf(i),i));
        }
        executor.shutdown();//iş ataması bittikten sonra kapatır threadler bitmeden executorı kapatmaz
        System.out.println("Tüm işler teslim edildi...");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);//burada yapılacak iş çok uzun sürse de bu kadar süre geçtikten sonra program sonlanır threadlerin işi bitse de bitmese de
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tüm işler bitti...");

    }
}
