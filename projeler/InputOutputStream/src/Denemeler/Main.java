package Denemeler;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz.");
        String idmanlar = "---Geçerli idmanlar---\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat\n";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun.");

        System.out.print("Burpee sayısı : ");
        int burpee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Pushup sayısı : ");
        int pushup = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Situp sayısı : ");
        int situp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Squat sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız başlıyor.");

        int i = 1 ;
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("idman Programı\n");
            writer.write("Burpee Sayısı : " + idman.getBurpee_sayisi() + "\n");
            writer.write("Pushup Sayısı : " + idman.getPushup_sayisi() + "\n");
            writer.write("Situp Sayısı : " + idman.getSitup_sayisi() + "\n");
            writer.write("Squat Sayısı : " + idman.getSquat_sayisi() + "\n");


            while (idman.idmanBittiMi() == false) {
                System.out.print("Hareket türü (burpee, pushup,situp,squat) : ");
                String tur = scanner.nextLine();
                System.out.println("Bu hareketten kaç tane yapacaksınız: ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman.haraketYap(tur, sayi);

                writer.write(i +" . İşlem -----------> Hareket : "+ tur + "Sayı : "+ sayi + "\n");
                i++;

            }
            System.out.println("İdmanını başarıyla bitirdin!");
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
