import java.util.Scanner;

public class harf_notu_hesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. vize notunuzu giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("2. vize notunuzu giriniz: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        int finalnot = scanner.nextInt();

        System.out.print("Okul not ortalamanızı giriniz: ");
        double ortalama= scanner.nextDouble();

        double toplam = ((vize1*30/100)+(vize2*30/100)+(finalnot*40/100) );

        if (toplam>=90){
            System.out.print("Harf notunuz AA");
        }
        else if (toplam>=85) {
            System.out.print("Harf notunuz BA");
        }
        else if (toplam>=80) {
            System.out.print("Harf notunuz BB");
        }
        else if (toplam>=75) {
            System.out.print("Harf notunuz CB");
        }
        else if (toplam>=70) {
            System.out.print("Harf notunuz CC");
        }
        else if (toplam>=65) {
            System.out.print("Harf notunuz DC");
        }
        else if (toplam>=60) {
            System.out.println("Harf notunuz DD");
            if (ortalama<2.5){
                System.out.print("DD aldınız ve not ortalamanız düşük. Bu dersi tekrardan alabilirsiniz.");
            }
        }
        else if (toplam>=55) {
            System.out.print("Harf notunuz FD");
        }
        else if (toplam<55) {
            System.out.print("Harf notunuz FF ve kaldınız.");
        }
        else {
            System.out.println("Lütfen geçerli bir not giriniz...");
        }



    }
}
