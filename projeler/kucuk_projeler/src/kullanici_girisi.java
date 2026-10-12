import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        System.out.println("************************************************");
        System.out.println("Giriş Ekranına Hoşgeldiniz...");
        System.out.println("************************************************");

        String sys_kullanici_adi= "admin";
        String sys_sifre = "1234";

        while(true){
            System.out.print("Kullanıcı adı : ");
            String kullanici_adi = scanner.nextLine();
            System.out.print("Şifre : ");;
            String sifre = scanner.nextLine();

            if (kullanici_adi.equals(sys_kullanici_adi) && (sifre.equals(sys_sifre))){
                System.out.println("Başarılı giriş yaptınız.");
                break;
            }
            else if (!(kullanici_adi.equals(sys_kullanici_adi)) && (sifre.equals(sys_sifre))) {
                System.out.println("Kullanıcı adı yanlış.");
                giris_hakki -=1;
                System.out.println("Kalan giriş hakkı:" + giris_hakki);

            }
            else if ((kullanici_adi.equals(sys_kullanici_adi)) && !(sifre.equals(sys_sifre))) {
                System.out.println("Şifre adı yanlış.");
                giris_hakki -=1;
                System.out.println("Kalan giriş hakkı:" + giris_hakki);

            }
            else {
                System.out.println("Kullanıcı adı ve şifre yanlış.");
                giris_hakki -=1;
                System.out.println("Kalan giriş hakkı:" + giris_hakki);
            }

            if (giris_hakki==0){
                System.out.println("Giriş hakkınız bitmiştir.");
                break;
            }
        }

    }
}

