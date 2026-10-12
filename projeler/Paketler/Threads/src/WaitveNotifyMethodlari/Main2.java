package WaitveNotifyMethodlari;

public class Main2 {
    public static void main(String[] args){
        PoducerConsumer pc = new PoducerConsumer();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
