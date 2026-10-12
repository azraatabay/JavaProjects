package generic_methodlar;

public abstract class AAday {
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;

    public AAday(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
        this.isim= isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTurkce() {
        return turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    abstract int puan_hesapla();

}
