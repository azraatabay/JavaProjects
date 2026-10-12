public class Anonimclass1 {
    public static void main(String[] args){
         IOgrenci ogrenci = new IOgrenci() {
             @Override
             public void ders_calis() {
                 System.out.println("Ders çalışıyorum.");
             }

             @Override
             public void derse_gir() {
                 System.out.println("Derse giriyiorum.");
             }
         };// bu bir class tanımlaması gibi olduğundan süslü parantezin sonuna ; ekledik

        ogrenci.ders_calis();
        ogrenci.derse_gir();


    }

    public interface IOgrenci{
        void ders_calis();
        void derse_gir();

    }
}
