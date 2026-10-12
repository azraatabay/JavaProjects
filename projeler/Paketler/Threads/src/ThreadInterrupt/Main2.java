package ThreadInterrupt;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<Integer>();
        System.out.println();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                for (int i = 0 ; i<1000000;i++){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye uğradı...");
                        return; //return run methodunu yok eder thread çalışmasını durdurur
                    }
                    list.add(i);
                }
                System.out.println("Thread kesintiye uğramadan işini bitirdi.");
            }
        });
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.interrupt();


    }
}
