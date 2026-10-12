package Serialization.Serialization2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args){
        Ogrenci ogrenci1 = new Ogrenci("Azra", 21, "Bilgisayar mühendisliği");
        Ogrenci ogrenci2=new Ogrenci("Oğuz",678 , "Finansal matematik");
        Ogrenci ogrenci3=new Ogrenci("Mehmet",123 , "Bilgisayar mühendisliği");

        Ogrenci[] ogrenci_array = {ogrenci1, ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamdı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}
