package Serialization.HafizaOyunuKaydetme;

import java.io.Serializable;

public class Kart implements Serializable {
    private char deger;
    private boolean tahmin = false;

    public Kart(char deger){
        this.deger= deger;
    }

    public void setDeger(char deger){
        this.deger=deger;
    }
    public void setTahmin(boolean tahmin){
        this.tahmin=tahmin;
    }
    public char getDeger(){
        return deger;
    }
    public boolean isTahmin(){
        return tahmin;
    }
}

