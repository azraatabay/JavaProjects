public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(int bakiye, String parola, String kullaniciAdi) {
        this.bakiye = bakiye;
        this.parola = parola;
        this.kullaniciAdi = kullaniciAdi;
    }

    public void paraYatir(int tutar){
        this.bakiye += tutar;
        System.out.println("Yeni bakiyeniz: "+ bakiye);
    }

    public void paraCek(int tutar){
        if (tutar>bakiye){
            System.out.println("Bakiyeniz yetersiz. Bakiye : " + bakiye);
        }
        else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }


}
