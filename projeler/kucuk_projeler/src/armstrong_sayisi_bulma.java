import java.util.Scanner;

public class armstrong_sayisi_bulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Sayının basamak sayısını giriniz: " );
        int basamak_sayisi = scanner.nextInt();
        int gecici_sayi = sayi;
        int toplam=0;


        do {
            int basamak_degeri = gecici_sayi % 10; //10 ile bölümünden kalan en sondan başlayıp basamaklarındaki değerleri vericek
            gecici_sayi /= 10; // burada sayının 10 ile bölündüğünde kalanı yeni geçici sayı oluyor (sayı 1643 ise artık 164 oluyor kalansın böler)
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
        }while (gecici_sayi > 0);

        if (sayi==toplam){
            System.out.println("Armstrong sayısıdır.");
                }
        else {
            System.out.println("Armstrong sayısı değildir.");
            }
    }
}