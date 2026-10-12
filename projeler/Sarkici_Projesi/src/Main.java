import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir(){
        System.out.println("\t 0- İşlemleri Görüntüle");
        System.out.println("\t 1- Şarkıcıları Görüntüle");
        System.out.println("\t 2- Şarkıcı Ekle ");
        System.out.println("\t 3- Şarkıcı Güncelle");
        System.out.println("\t 4- Şarkıcı Sil");
        System.out.println("\t 5- Şarkıcı Ara");
        System.out.println("\t 6- Uygulamadan Çık");

    }
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle(){
        System.out.print("Eklemek istediğiniz şarkıcının ismi : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.print("Hangi numaradaki şarkıcıyı güncellemek istiyorsunuz : ");
        int sayi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Güncellemk istediğiniz şarkıcının ismini giriniz : ");
        String yeni_isim = scanner.nextLine();

        sarkicilar.sarkici_guncelle(yeni_isim,(sayi-1));
    }
    public static void sil(){
        System.out.print("Silmek istediğiniz şarkıcının numarası : ");
        int sayi = scanner.nextInt();
        sarkicilar.sarkici_sil(sayi-1);
    }
    public static void ara(){
        System.out.print("Bulmak istediğiniz şarkıcının adını giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args){
        System.out.println("\t Şarkıcı Uygulamasına Hoş Geldiniz...");
        islemleri_bastir();

        boolean cikis = false;
        int islem;

        while (!cikis){
            System.out.print("Bir işlem seçiniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
        }
    }


}
