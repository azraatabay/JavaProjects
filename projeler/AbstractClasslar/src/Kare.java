public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim, int kenar){
        super(isim);
        this.kenar= kenar;
    }
    @Override
    void alani_hesapla() {
        System.out.println(getIsim() + " alanı "+ (kenar*kenar) + " dır");
    }

    public void cevre_hesapla(){
        System.out.println(getIsim()+ " çevresi "+ (4*kenar));
    }
}
//abstract classlarda da inhertance de olduğu gibi extends anahtar kelimesi ile kullanıyoruz