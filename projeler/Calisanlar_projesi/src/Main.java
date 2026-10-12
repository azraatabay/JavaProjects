import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz.");

        String islemler = ("---İşlemler---\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşlemleri\n"
                + "Çıkış için q'ya basınız.");
        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");

        while (true){
            System.out.print("Lütfen bir işlem seçiniz:");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor.");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Mert", "Gürhan", 12345 , "İngilizce, Almanca" );
                String yazilimci_islem= ("1. Format at\n"
                        + "2. Bilgileri göster.\n"
                        + "Çıkış için q ya basın.");
                System.out.println(yazilimci_islem);

                while(true){
                    System.out.print("Lütfen bir işlem seçiniz:");
                    String yaz_islem = scanner.nextLine();
                    if(yaz_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinde çıkış yapılıyor.");
                        break;
                    }
                    else if (yaz_islem.equals("1")) {
                        System.out.print("İşletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    }
                    else if (yaz_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz işlem girdiniz.");
                    }
                }
            }

            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Azra","Atabay", 54321,10);

                String yonetici_islem = ("---Yönetici işlemleri---\n"
                        + "1. Zam yap.\n"
                        + "2. Bilgileri göster.\n"
                        + "Çıkış yapmak için q'ya basınız.");
                System.out.println(yonetici_islem);

                while(true){
                    System.out.print("Lütfen bir işlem seçiniz: ");
                    String yön_islem= scanner.nextLine();

                    if (yön_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkış yapılıyor.");
                        break;
                    }
                    else if (yön_islem.equals("1")){
                        System.out.print("Zam miktarını giriniz: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if(yön_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz işlem girdiniz.");
                        return;
                    }
                }
            }

            else{
                System.out.println("Geçersiz işlem girdiniz.");
                return;
            }
        }


    }
}