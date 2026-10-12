import java.util.Scanner;

public class metodlar {
    public static void selamlama(){  // burada method tanımladım eğer  bu methoda ihtiyacım olursa herangi bir yerde çağırabilirim
        System.out.println("Merhaba nasılsınız? ");
        System.out.println("Selamlaar...");

    }
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while(sayi>0){
            faktoriyel *= sayi;
            sayi -=1;
        }
        System.out.println("Faktöriyel = " + faktoriyel);

    }

    public static void selam (String isim){
        System.out.println("Selamlar " + isim);
    }

    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlar : " + (a+b+c) );
    }




    public static void main(String[] args){   //tanımlanana fonksiyonlar main methodu içinde çalışabilir
        selamlama();
        faktoriyel();
        selam("cnm");
        toplama(3,4,5);
    }


}


