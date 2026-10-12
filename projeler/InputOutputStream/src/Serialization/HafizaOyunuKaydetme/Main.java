package Serialization.HafizaOyunuKaydetme;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void KayittanAl(){
        File file = new File("kayit.bin");
        if (file.exists()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kaydedilmiş bir oyununuz var. Devam etmek istiyor musunuz?(yes ya da no)");
            String  cevap = scanner.nextLine();
            if(cevap.equals("yes")){
                kartlar = OyunKayit.KayıttanAl();
                return;
            }

        }
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
    }


    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KayittanAl();


        while (oyunBittiMi()== false){
            oyunTahtasi();
            System.out.println("Çıkış için q ya basın.(yes ya da no) : ");
            String cikis = scanner.nextLine();

            if (cikis.equals("yes")){
                System.out.println("Oyunu kaydetmek istiyor musunuz?(yes ya da no)");
                String kayit = scanner.nextLine();
                if (kayit.equals("yes")){
                    OyunKayit.OyunKaydet(kartlar);
                }
                else{
                    System.out.println("Oyun kaydedilmedi.");
                }
                System.out.println("Oyundan çıkılıyor...");
                break;
            }


            tahminEt();

        }
    }
    public static boolean oyunBittiMi(){
        for (int i =0 ; i<4; i++){
            for (int j=0; j<4; j++){
                if (kartlar[i][j].isTahmin() == false){
                    return false;
                }
            }
        }
        return true;
    }

    public static void tahminEt(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci tahmini giriniz (i ve j arasında boşluk olacak şekilde) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.print("İkinci tahmini giriniz (i ve j arasında boşluk olacak şekilde) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            System.out.println("Doğru tahmin tebrikler.");
            kartlar[i2][j2].setTahmin(true);
        }
        else {
            System.out.println("Yanlış tahmin");
            kartlar[i1][j1].setTahmin(false);
        }
    }



    public static void oyunTahtasi(){
        for (int i = 0 ; i<4; i++){
            System.out.println("-------------------");
            for (int j = 0; j<4; j++){
                if (kartlar[i][j].isTahmin()){
                    System.out.print(" |"+ kartlar[i][j].getDeger()+"| ");
                }
                else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }
}
