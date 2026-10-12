package ThreadSynchronize;

public class ThreadSafe {
    private int count = 0 ;

    public synchronized void arttir(){
        count++;
        //synchronized anahtar kelimesisi sayesinde bir threadin işi bitene kadar başka thread oraya gieremez


    }

    public void thradeleriCalistir(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i<5000 ; i++){
                    arttir();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i<5000 ; i++){
                    arttir();
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join(); //join methodu sayesinde buradaki işlemlerde bitmeden main thredi çalışmayacak
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Count değişkeninin değeri : "+ count );//burası main threadine aittir

    }

    public static void main(String[] args){
        ThreadSafe threadsafe = new ThreadSafe();
        threadsafe.thradeleriCalistir(); //main thread burada yukarıdaki methodu çağırıyor

    }
}
