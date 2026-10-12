package generic_sınıflar;

public class Ogrenci {
    private String isim;
    public Ogrenci(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    @Override
    //toString metodu ile ogrenci objesi sout ile direkt olarak bastırılabilir
    public String toString() {
        return "İsim : " + isim;
    }
}
