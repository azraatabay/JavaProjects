import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Siyası yasağınız bulunuyor mu (evet veya hayır): ");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu (evet ya hayır) : ");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu= false;
        }
    }

    @Override
    public boolean yurt_disi_harci() {
        if (this.harc <15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak() {
        if (this.siyasiYasak==true){
            System.out.println("Siyası yasağınız bulunuyor. Yurtdışında çıkamazsınız. ");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor. ");
            return true;
        }
    }

    @Override
    public boolean vize_durumu() {
        if (this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam.");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır. Yurtdışına çıkamazsınız.");
            return false;
        }
    }
}
