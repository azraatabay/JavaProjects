import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("---Bayblade Programına Hoşgeldiniz---");
        System.out.println("Çıkış için q'ya basınız.");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi Bayblade'i üretmek istiyorsunuz : " );
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade==null) {
                    System.out.println("Lütfen geçerli bir Beyblade ismi giriniz");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }

    }
}