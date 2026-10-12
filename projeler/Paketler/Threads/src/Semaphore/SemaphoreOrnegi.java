package Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {
    private Semaphore sem = new Semaphore(3);
    //aynı anda 3 tane kod bloğunu çalıştır dedik semaphore a
    public void threadFonksiyonu(int id){
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread başlıyor... ID : "+ id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread çıkıyor... ID : "+ id);
        sem.release();
    }
}
