import java.util.Scanner;
public class beden_kitle_endeksi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boy(ör 1,69): " );
        double boy = scanner.nextDouble();
        System.out.println("Boyunuz: " + boy);

        System.out.println("Kilo(ör 65): ");
        double kilo = scanner.nextDouble();
        System.out.println("Kilonuz: "+ kilo);

        double sonuc = kilo/(boy*boy);
        System.out.println("Beden Kitle İndeksiniz: "+ sonuc);

        if (sonuc<18.5){
            System.out.println("Düşük kilolusunuz.");
        }
        else if (sonuc>=18.5 && sonuc<=24.9) {
            System.out.println("Normalsiniz.");
        }
        else if (sonuc>=25 && sonuc<=29.9) {
            System.out.println("Kilolusunuz.");
        }
        else if (sonuc>=30 && sonuc<=34.9) {
            System.out.println("Obezsiniz.");
        }
        else {
            System.out.println("Morbid Obezsiniz.");
        }
    }

}
