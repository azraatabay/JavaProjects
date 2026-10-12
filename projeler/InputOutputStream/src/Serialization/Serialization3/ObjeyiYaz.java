package Serialization.Serialization3;

import java.io.*;

public class ObjeyiYaz {
    public static void main(String[] args){
        Ogrenci ogrenci1 = new Ogrenci("Azra",345, "Bilgisayar mühendisliği");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci1.bin"))){
            out.writeObject(ogrenci1);

            Ogrenci.setOgreni_sayisi(100);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
