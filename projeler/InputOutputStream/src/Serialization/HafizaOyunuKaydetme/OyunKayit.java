package Serialization.HafizaOyunuKaydetme;

import java.io.*;

public class OyunKayit {
    public static void OyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
            System.out.println("Oyun kaydediliyor...");
            out.writeObject(kartlar);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Kart[][] KayıttanAl(){
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
                Kart[][] cikti = (Kart[][])in.readObject();
                return cikti;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

    }

}
