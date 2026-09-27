class Hayvan{
    private String isim;

    public Hayvan(String isim){
        this.isim=isim;
    }

    public String konus(){
        return "Hayvan konuşuyor.";
    }

     public String getIsim(){
        return isim;
     }
     public void setIsim(String isim){
        this.isim= isim;
     }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor.";
    }
}

class Kopek extends Hayvan{
    public Kopek (String isim){
        super(isim);
    }

    @Override
    public String konus(){
        return this.getIsim() + " havlıyor.";
    }
}
class At extends Hayvan {
    public At (String isim){
        super(isim);
    }

    @Override
    public String konus(){
        return this.getIsim()+ " kişniyor";
    }
}
class Kus extends Hayvan{
    public Kus (String isim){
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + "ötüyor.";
    }

}




public class Main {
    public static void konustur(Object object) {
        if (object instanceof Kopek){
            Kopek kopek = (Kopek) object; // eğer obje kopek sınıfındansa objeyi kopeğe dönüştür
            System.out.println(kopek.konus());
        }
        else if (object instanceof Kedi){
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if(object instanceof At){
            At at = (At) object;
            System.out.println(at.konus());
        }
        else if (object instanceof Hayvan){
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }

        //System.out.println(object.konus());
    }
    public static void main(String[] args) {

       /* Hayvan hayvan1 = new Kedi("Tekir"); //bir tane referans birden farklı obje gibi davranıyor poly morphism
        //bir tane hayvan referasımız var  ama biz buna kedi referansı atadık
        System.out.println(hayvan1.konus()); //buradaki hayvan referansı kedi referansı gibi davrandı

        Hayvan hayvan2 = new Kopek("Karabaş");
        System.out.println(hayvan2.konus());

        Hayvan hayvan3 = new At("At");
        System.out.println(hayvan3.konus());

konustur(new Kedi("Tekir"));
konustur( new Kopek("Karabaş"));
konustur(new At("At"));

Kopek kopek =new Kopek("Karabaş");
if (kopek instanceof Kopek){ //bunun anlamı kopek referansı Kopek class ından mıdır diye kontrol ediyoruz
    System.out.println("Bu nesne Kopek sınıfınfandır"); */

    Kopek kopek = new Kopek("Karabaş");
    Kedi kedi = new Kedi("Tekir");
    At at = new At("At");
    Kus kus = new Kus("Zeytin");
    Hayvan hayvan = new Hayvan("Limon");
    konustur(kopek);
    konustur(kedi);
    konustur(at);
    konustur(hayvan);

    // polimorfizm olmasaydı kodları bu şekilde teker teker yazmak ve kontrol etmek zorunda kalıcaktık


}
}

