package WaitveNotifyMethodlari;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PoducerConsumer {
    Random random = new Random();
    Object lock = new Object();

    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10 ;
    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if (queue.size()==limit){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer üretiyor : "+ value);
                lock.notify(); //uyuyan bir consumer varsa uyandırmış olucak
            }

        }
    }

    public void consume(){
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock){
                if (queue.size()==0){
                    try {
                        lock.wait();
                        //eğer hiçbir eleman eklenmemişse producer ın bunu uyandırması gerekiyor
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();
                System.out.println("Consumer tüketiyor : "+ value);
                System.out.println("Queue Size : "+ queue.size());
                lock.notify();

            }
        }
    }
}
