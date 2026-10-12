public abstract class Sekil {
    private String isim;

    public Sekil(String isim){
        this.isim = isim;
    }

    abstract void alan_hesapla();

    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }
}

//aslında burada polimorfizm kullanmış oluyor Sekil classı kare, daire, ucgeni extends olarak kullanıyor
//birden fazla şekilde kullanılıyor