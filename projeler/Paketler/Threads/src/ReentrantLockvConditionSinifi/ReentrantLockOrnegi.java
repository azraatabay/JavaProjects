package ReentrantLockvConditionSinifi;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnegi {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void arttir(){
        for(int i = 0 ; i<10000; i++){
            say++;
        }

    }

    public void threadFonksiyonu1() {
        lock.lock();
        System.out.println("Thread 1 çalışıyor...");
        System.out.println("Thread 1 uyandırılmayı bekliyor...");
        try {
            condition.await(); //wait methodu gibi çalışır.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 uyandırıldı ve işlemine devam ediyor...");

        arttir();
            lock.unlock();
    }
    public void threadFonksiyonu2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);

        lock.lock();

        System.out.println("Thread 2 çalışıyor...");
            arttir();
        System.out.print("Devam etmek için herhangi bir tuşa basın : ");
        scanner.nextLine();
        condition.signal();
        System.out.println("Thread 1 uyandırıldı. Kapanıyor...");
            lock.unlock();
    }



    public void threadOver(){
        System.out.println("Say değişkeninin değeri : "+ say);
    }

}
