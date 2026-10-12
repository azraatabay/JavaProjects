import java.util.Scanner;

public class faiz_hesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz oranı %6 dır.");
        System.out.println("Ana paranızın miktarını giriniz: ");
        int ana_para = scanner.nextInt();
        System.out.println("Kaç yıl vadede kalacağını giriniz: ");
        int vade = scanner.nextInt();

        double toplam= ana_para;
        double faiz_oranı = 0.06;

        for (int i = 1 ; i<= vade ; i++){
            toplam = toplam + (toplam*faiz_oranı);
            System.out.println(i + " yılın sonunda toplam para : " + (int)toplam);
        }
    }
}
/*
kullanıcı ana parasını girecek kaç yıl vadeli istediğini girecek ve yıl sonundaki parasını görecek
 */