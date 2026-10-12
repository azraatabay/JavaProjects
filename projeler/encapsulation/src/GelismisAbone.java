public class GelismisAbone {
    private String isim;
    private int bakiye = 120; //burada bakiye değeri vermesek de 120 den başlatılacak demek oluyor
    private String sehir;

    public GelismisAbone(String isim,int bakiye, String sehir){
        this.isim = isim;
        if (bakiye>0 && bakiye<=120){
            this.bakiye= bakiye;
        }

        this.sehir= sehir;
    }
    public void dogal_gaz_kullan(int miktar){
        if(this.bakiye-miktar<0){
            System.out.println("Yeterli bakiye yok.");
        }
        else{
            this.bakiye-= miktar;
        }
        if (this.bakiye<=0){
            System.out.println("Bakiyeniz bimiştir. Lütfen en yakın abona merkezine giderek kredi yükleyin." +
                    "Kredi Limiti = 120 TL" );
        }
    }

    public void bakiye_ogren(){
        System.out.println("Bakiye = "+ bakiye);
    }
}



