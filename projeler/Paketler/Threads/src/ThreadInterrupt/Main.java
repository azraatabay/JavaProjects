package ThreadInterrupt;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
                   Thread t = new Thread(new Runnable() {
                       @Override
                       public void run() {
                           for (int i = 1 ; i<=10 ; i++){
                               System.out.println("Thread çalışıyor...");
                               try {
                                   Thread.sleep(1000);
                               } catch (InterruptedException e) {
                                   System.out.println("Uyku bölündü...");
                               }
                           }
                       }
                   });
                   t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.interrupt();
        //burada threadin çalışması durdurulmaz sadece kesintiye uğrar


    }
}
