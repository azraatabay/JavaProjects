package ArrayBlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = random.nextInt(100);
                System.out.println("Producer üretiyor..."+ value);
                queue.put(value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void consume(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Integer value = queue.take();
                System.out.println("Consumer tüketiyor..."+ value);
                System.out.println("Queue size : " + queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
