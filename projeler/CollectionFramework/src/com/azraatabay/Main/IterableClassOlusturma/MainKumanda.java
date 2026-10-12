package com.azraatabay.Main.IterableClassOlusturma;

import java.util.Scanner;

public class MainKumanda {
    public static void main(String[] args){
        System.out.println("Kumanda Programına Hoşgeldiniz....");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n" +
                "1. Kanalları göster \n" +
                "2. Kanal Ekle\n" +
                "3. Kanal Sil\n" +
                "4. Kanal Sayısı Öğren\n" +
                "Çıkış için q'ya basınız.";
        KumandaProjesi kumanda = new KumandaProjesi();
        while (true){
            System.out.println(islemler);
            System.out.print("İşlemi Giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                kanallariGoster(kumanda);
            }
            else if (islem.equals("2")){
                System.out.print("Eklenecek kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);
            }
            else if (islem.equals("3")){
                System.out.print("Silincek kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalSil(kanal_ismi);
            }
            else if (islem.equals("4")){
                System.out.println("Kanal sayısı : "+ kumanda.kanalSayisi());
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
    public static void kanallariGoster(KumandaProjesi kumanda){
        if (kumanda.kanalSayisi() == 0 ){
            System.out.println("Şu anda hiçbir kanal bulunmamaktadır.");
        }
        else {
            for (String kanal : kumanda){
                System.out.println("Kanal : " + kanal);
            }
        }
    }

}
