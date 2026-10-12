package generic_methodlar;

public class Sayisal extends AAday {
    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim ) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puan_hesapla() {
        return (getTurkce()*5) + (getMatematik()*5) +(getEdebiyat()*1 + (getFizik()*4) );
    }

}
