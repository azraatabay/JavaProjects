package ThreadHavuzlari;

public class Worker implements Runnable{
    //thread class oluşturacağımız için runnable ı implemente ettik

    private  String isim;
    private int taskId;

    public Worker(String isim, int taskId){
        this.isim = isim;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker "+ isim+ " "+ taskId + ". işe başladı.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker "+ isim+ " "+ taskId + ". işe bitirdi.");

    }

}
