package Serialization.Serialization3;

import java.io.*;

public class ObjeyiOku {
    public static void main(String[] args){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci1.bin"))){
            Ogrenci ogrenci = (Ogrenci) in.readObject();
            System.out.println(ogrenci);
            System.out.println("Öğrenci sayısı : "+ Ogrenci.getOgreni_sayisi());
            //bu çalıştığınca öğrence sayısının değerini 0 gösteririr.
            //bunun nedeni static özellik classa özgü olduğu için java bunu otomatik olarak serileştirmez başına transient koymuş gibi oluruz
            //static özellikler objeye değil classa özgü olmuş olur java bunu serileştirmeye gerek yok olarak algılar


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
