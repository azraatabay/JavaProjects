package Denemeler;

import java.io.*;
import java.util.Scanner;

public class DosyadanOkuyarakNotHesaplama {
    public static String harfnotuHesapla(String isim, int vize1, int vize2 , int finalnot){
        String cikti = "";
        double toplamnot = (vize1*30/100)+(vize2*30/100)+ (finalnot*40/100);
        if (toplamnot>= 90){
            cikti = isim + " bu dersten AA aldı.";
        }
        else if (toplamnot>= 85){
            cikti = isim + " bu dersten BA aldı.";
        }
        else if (toplamnot>= 80){
            cikti = isim + " bu dersten BB aldı.";
        }
        else if (toplamnot>= 75){
            cikti = isim + " bu dersten CB aldı.";
        }
        else if (toplamnot>= 70){
            cikti = isim + " bu dersten CC aldı.";
        }
        else if (toplamnot>= 65){
            cikti = isim + " bu dersten DC aldı.";
        }
        else if (toplamnot>= 60 ){
            cikti = isim + " bu dersten DD aldı.";
        }
        else if (toplamnot>= 55){
            cikti = isim + " bu dersten FD aldı.";
        }
        else {
            cikti = isim + " bu dersten FF aldı.";
        }
        return cikti;
    }
    public static void main(String[] args){
        try (Scanner scanner =new Scanner(new FileReader("OgrenciNotlari"));
             FileWriter writer = new FileWriter("harfnotlari.txt")) {

            while (scanner.hasNextLine()){
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenci_array = ogrenciBilgileri.split(",");

                int vize1 = Integer.valueOf(ogrenci_array[1]);
                int vize2 = Integer.valueOf(ogrenci_array[2]);
                int finalnot = Integer.valueOf(ogrenci_array[3]);
                String cikti = harfnotuHesapla(ogrenci_array[0],vize1,vize2,finalnot);
                writer.write(cikti + "\n");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
