import java.util.Scanner;

public class rakamlari_toplami_bulma_dowhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam= 0 ;
        do{
            toplam+= sayi%10;
            sayi/= 10;
            System.out.println("Sayı: "+sayi);
        }while (sayi>0);
        System.out.println("Rakamları toplamı: "+ toplam);
    }
}


