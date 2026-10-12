package generic_methodlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("YGS LYS Birinci Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        String islemler = "---İşlemler---\n" +
                "1. Eşi ağırlık öğrencileri birincisi\n" +
                "2. Sayısal öğrencileri birincisi\n" +
                "Çıkış için q'ya basınız.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");
        while (true){
            System.out.print("Bir işlem seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            System.out.println("Birinci öğrenci ismi : ");
            String isim1 = scanner.nextLine();
            System.out.println("Netler (Türkçe, Matematik, Edebiyat, Fizik))");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();
            //İkinci öğrenci
            System.out.println("İkinci öğrenci ismi : ");
            String isim2 = scanner.nextLine();
            System.out.println("Netler (Türkçe, Matematik, Edebiyat, Fizik))");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();
            //Üçüncü öğrenci
            System.out.println("Üçüncü öğrenci ismi : ");
            String isim3 = scanner.nextLine();
            System.out.println("Netler (Türkçe, Matematik, Edebiyat, Fizik))");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();




            if (islem.equals("1")) {
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3, isim3);

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2,ogrenci3);
                System.out.println("Birinci eşit ağırlık öğrencisi : "+ birinci.getIsim());
                System.out.println("Birinci olan öğrencinin puanı : "+ birinci.puan_hesapla());


            }
            else if(islem.equals("2")){
                Sayisal ogrenci1 = new Sayisal(turkce1,matematik1,edebiyat1,fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2,matematik2,edebiyat2,fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3,matematik3,edebiyat3,fizik3, isim3);

                Sayisal birinci = birinci(ogrenci1,ogrenci2,ogrenci3);

                System.out.print("Birinci sayısal öğrencisi : "+ birinci.getIsim());
                System.out.print("Birinci olan öğrencinin puanı : "+ birinci.puan_hesapla());
            }
            else {
                System.out.println("Geçersiz işlem girdiniz.");
                return;
            }
        }

}
    public static <E extends AAday> E  birinci(E e1, E e2 , E e3) {
        if (e1.puan_hesapla() > e2.puan_hesapla() && e1.puan_hesapla() > e3.puan_hesapla()) {
            return e1;
        }
        else if (e2.puan_hesapla() > e1.puan_hesapla() && e2.puan_hesapla() > e3.puan_hesapla()) {
            return e2;
        }
        else {
            return e3;
        }
        //gönderilecek veri tipleri sadece AAday classını extends edenlerden olabilir anlamına geliyor.

    }
}
