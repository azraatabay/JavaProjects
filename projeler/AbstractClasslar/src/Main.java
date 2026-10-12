public class Main {
    public static void main(String[] args){

        Sekil sekil; // Sekil abstarct class ından sekil referansı oluşturduk
        sekil = new Kare("Kare2",6); //yukarıda üretilen sekil referansı alt sınıflara referans oldu
        sekil.alani_hesapla();
        //abstract class ların referanslarını alt sınıflara direkt olarak eşitleyebiliriz.

        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1" ,3 );

        kare1.alani_hesapla();
        daire1.alani_hesapla();
        kare1.cevre_hesapla();
    }
}