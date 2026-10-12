import java.util.Scanner;

public class iki_sayiyi_yerdegistirme {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Değiştirilmeden önce----");
        System.out.print("Lütfen 1. tamsayıyı sayıyı giriniz: ");
        int first = scanner.nextInt();
        System.out.print("Lütfen 2. tamsayıyı giriniz: ");
        int second = scanner.nextInt();
        System.out.println("Birinci sayı: "+ first );
        System.out.println("İkinci sayı : " + second);

        System.out.println("----Değiştirildikten sonra----");
        System.out.println("Birinci sayı : " + second);
        System.out.println("İkinci sayı : " + first);

        /*
        aynı işlemi geçici değişken kullanarak da yapabilirdik
        int gecici = first;
        first= second;
        second = gecici;
         */

    }

}
