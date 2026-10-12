import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Matematik.Factorial factorial_referans = new Matematik().new Factorial();
        //inner classlardan obje oluştururken önce dıştan içe doğru obje oluşturulur
        //önce dış class sonra içerdekiler tanımlanır

        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan.Daire_Alan alan = new Matematik().new Alan().new Daire_Alan(); //dıştan içe doğru obje oluşturulur

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        if (asal.asal_mi(sayi)){
            System.out.println("Bu sayı asaldır. ");
        }
        else {
            System.out.println("Bu sayı asal değildir. ");
        }

        factorial_referans.faktoriyel();

        System.out.print("Yarıçap değerini giriniz : ");
        int yaricap = scanner.nextInt();
        alan.daire_alan(yaricap);

    }
}