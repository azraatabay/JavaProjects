import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String islemler;
        islemler = "--- İşlemler ---\n" +
                "1. Kare alanı hesapla\n" +
                "2. Üçgen alanı hesapla" +
                "3. Daire alanı hesapla\n" +
                "Çıkış için q'ya basınız.";


        while (true){
            System.out.println(islemler);
            System.out.print("Hangi işlemi yapmak istiyorsunuz  : ");
            String islem = scanner.nextLine();
            Sekil sekil = null;

            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Karenin kenarını giriniz: ");
                int kenar = scanner.nextInt();
                scanner.nextLine(); //dummy hatası için

                sekil = new Kare("kare1", kenar);
                sekil.alan_hesapla();
            }
            else if (islem.equals("2")) {
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("üçgen1", kenar1,kenar2,kenar3);
                sekil.alan_hesapla();
            }
            else if (islem.equals("3")){
                System.out.print("Dairenin yarıçapını giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("daire1 ", yaricap);
                sekil.alan_hesapla();
            }
            else {
                System.out.println("Geçersiz işlem numarası girdiniz.");
            }
        }
    }
}