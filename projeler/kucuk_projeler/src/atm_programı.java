import java.util.Scanner;

public class atm_programı {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        String islemler;
        islemler = "1- Bakiye Öğrenme\n"
                +"2- Para Çekme\n"
                +"3- Para Yatırma\n"
                +"Çıkış yapmak için q'ya basınız.";
        System.out.println("------------------------------------");
        System.out.println(islemler);
        System.out.println("------------------------------------");

        while (true){
            System.out.println("Yapacağınız işlemi seçiniz : ");
            String islem= scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakineyiz: "+ bakiye);

            }
            else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if(bakiye-tutar < 0 ){
                    System.out.println("Bakiyeniz yetersizdir");
                }
                else  {
                    bakiye -=tutar;
                    System.out.println("Yeni bakiye : " + bakiye);
                }

            }
            else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
        }

    }
}