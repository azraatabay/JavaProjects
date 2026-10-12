package Deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockOrnegi {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    /*
    public void thread1Fonksiyonu(){
        lock1.lock();
        lock2.lock();
        for (int i = 0 ; i<5000 ; i++){
            Hesap.paraTransferi(hesap1,hesap2,random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void thread2Fonksiyonu(){
        lock1.lock();
        lock2.lock();
        for (int i = 0 ; i<5000 ; i++){
            Hesap.paraTransferi(hesap2,hesap1, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }
    //lockları kullanarak threadleri senkron hale getirdik
    //burada lockları alma sırası aynı olduğundan deadlock oluşmuyor

*/
    public void LocklariKontrolEt(Lock a , Lock b){
        boolean a_elde_edildi = false;
        boolean b_elde_edildi = false;
        while (true){
            a_elde_edildi = a.tryLock(); //tryLock sadece o lock müsaitse alınabilir anlamı verir
            b_elde_edildi = b.tryLock();

            if (a_elde_edildi == true && b_elde_edildi == true){
                return;
            }

            if (a_elde_edildi == true ){
                a.unlock();
            }
            if (b_elde_edildi == true){
                b.unlock();
            }
        }
        //bu kodlar sayesinde deadlock oluşmaz çünkü lock bıraktırılır
    }

    public void thread1Fonksiyonu(){
        LocklariKontrolEt(lock1,lock2); //deadlock önlenir
        for (int i = 0 ; i<5000 ; i++){
            Hesap.paraTransferi(hesap1,hesap2,random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void thread2Fonksiyonu(){
        LocklariKontrolEt(lock2,lock1);
        for (int i = 0 ; i<5000 ; i++){
            Hesap.paraTransferi(hesap2,hesap1, random.nextInt(100));
        }
        lock2.unlock();
        lock1.unlock();
    }
    //buradaki kodda bazı çalıştırmalarda aynı locku almak istedikleri için deadlock oluşuyor. Örneğin lock2 daha bırakılmamışken aşşağıdaki fonksiyonda isteniyor
    //ama bir fonskiyonun oluşabilmesi için her ikisine de ihtiyaç olduğundan bazen deadlocka a giriyor. her zaman ortaya çıkmaz
    public void threadOver(){
        System.out.println("Hesap1 bakiye : "+ hesap1.getBakiye() + "   Hesap2 bakiye : "+ hesap2.getBakiye() );
        System.out.println("Toplam bakiye : " + (hesap1.getBakiye()+hesap2.getBakiye()));
    }
}
