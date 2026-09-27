public class Main {
    public static void main(String[] args){
        /*Abone abone = new Abone();
        abone.isim= "Azra Atabay";
        abone.bakiye= 200;
        abone.sehir= "Muğla";
        abone.dogal_gaz_kullan(200); */

        GelismisAbone abone = new GelismisAbone("Azra Atabay", 200, "Muğla");
        //encapsulation sayesinde tanımladığımız her değişkeni kullamış oluyoruz unutmuyoruz.
        abone.bakiye_ogren(); // burada koşul koyduğumuz için 200 girsek bile 120 de sabitledi başta 120 verdik çünkü


    }
}