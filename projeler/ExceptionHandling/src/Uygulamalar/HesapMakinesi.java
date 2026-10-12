package Uygulamalar;

import java.util.InputMismatchException;
import java.util.Scanner;
class CarpmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("iki sayı da çok büyük. Lütfen daha küçük sayıları girin. ");
    }
}
public class HesapMakinesi {

    public static void main(String[] args){
        String islemler = "---İşlemler---\n" +
                "1. Toplama işlemi\n" +
                "2. Çıkarma işlemi\n" +
                "3. Çarpma işlemi\n" +
                "4. Bölme işlemi";

        Scanner scanner = new Scanner(System.in);
        String islem = scanner.nextLine();
        int a ;
        int b;

        try {


        switch (islem){
            case "1":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıları toplamları : "+ (a+b));
                break;

            case "2":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıları farkları : "+ (a-b));
                break;
            case "3":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                scanner.nextLine();
                if (a>10000 && b>10000){
                    throw new CarpmaException();
                }
                System.out.println("Girilen sayıları çarpımları : "+ (a*b));
                break;
            case "4":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıları bölümleri : "+ (a/b));
                break;

            default:
                System.out.println("Geçersiz işlem girdiniz.");

        }
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı sıfıra bölünemez.");
        }
        catch (InputMismatchException e){
            System.out.println("Lütfen inputları doğru formatta girin.");
        }
        catch (CarpmaException e){
            e.printStackTrace();
        }

    }

}
