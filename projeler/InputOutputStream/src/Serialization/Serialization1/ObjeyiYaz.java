package Serialization.Serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args){

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

            Ogrenci ogrenci1 = new Ogrenci("Azra", 1234, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Hilal",678, "Endüstri Mühendisliği");
            out.writeObject(ogrenci1);
            //writeObject methodu ogrenci objesini Objecte dönüştürücek sonra bunu byte dizisine dönüştürüp öğrenci dosyasına direkt kendisi yazıcak
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu. ");
        }

    }
}
