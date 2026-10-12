package WaitveNotifyMethodlari;

import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();
    //burada lock oluşturmamızın sebebi diğer threadları bloklamasını önlemek
    public void thread1Fonsiyonu(){
        synchronized (lock){
            System.out.println("Thread 1 çalışıyor...");
            System.out.println("Thread 1 Thread 2'nin kendisini uyadırmasını bekliyor...");

            try {
                lock.wait();
                //wait sayesinde anahtarı teslim eder başka birisi uyandırana kadar burdan ileri gidemez

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 uyandı. Devam ediyor...");
        }
    }

    public void thread2Fonksiyonu(){
          Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock){
            System.out.println("Thread 2 çalışıyor...");
            System.out.print("Devam etmek için herhangi bir tuşa basınız : ");
            scanner.nextLine();
            lock.notify();
            //notify yapmadan diğer thread uyanamıyor
            System.out.println("Thread 1 uyandırıldı. Thread 2 kapanıyor...(Bekleme süresi 2 saniye...)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
