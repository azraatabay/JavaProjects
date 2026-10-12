import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz...");
        String islemler  = "---İşlemler---\n" +
                "1- Daire alanı hesaplama\n" +
                "2- Üçgen çevresi hesaplama\n" +
                "3- İki vektörün iç çarpımını hesaplama\n" +
                "Çıkış için q'ya basınız.";

        while (true){
            System.out.println(islemler);
            System.out.print("işlemi seçiniz : ");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor.");
                break;
            }
            else if(islem.equals("1")){
                System.out.print("Dairenin yarıçapını giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daire_alan(yaricap);
            }
            else if(islem.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kenar 2 : ");
                int kenar2= scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kenar 3 :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgen_cevresi(kenar1,kenar2,kenar3);
            }
            else if(islem.equals("3")){
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                Problem.Fizik.ic_carpim(vec1,vec2);

            }
            else {
                System.out.println("Geçersiz işlem");
            }

        }

    }
}