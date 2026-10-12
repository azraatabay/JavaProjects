import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){//bu method Hesap classından üretilen bir nesne olmalı diyor
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Bankamıza Hoşgeldiniz---");
        System.out.println("****************************");
        System.out.println("Kullanıcı Giriş");
        System.out.println("****************************");
        int giris_hakki= 3;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else {
                System.out.println("Giriş başarısız");
                giris_hakki -=1;
                System.out.println("Kalan giriş hakkınız: "+ giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giriş hakkınız bitti.");
                return; //break yaparsak döngü sonlanır methodun sonlanması için return yazdık
            }
        }
        System.out.println("****************************");
        String islemler = "----İşlemler---\n"
                +"1. Bakiye Sorgulama\n"
                +"2. Para Yatırma\n"
                +"3. Para Çekme\n"
                +"Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("****************************");

        while(true){
            System.out.print("Lütfen bir işlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: "+ hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();//dummy hatası için
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz bir işlem girdiniz.");
            }

        }


    }
}
