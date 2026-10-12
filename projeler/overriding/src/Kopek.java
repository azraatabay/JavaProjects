public class Kopek extends Hayvan{
    private int dis_sayisi;

    public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi){
        super(isim, kilo, boy,bacak_sayisi);
        this.dis_sayisi= dis_sayisi;
    }
      public void harekete_gec(int hiz){
          System.out.println("Köpek "+ hiz + " ile hareket ediyor.");
     }
    public void kos(int hiz){
        System.out.println("Köpek koşuyor.");
        harekete_gec(hiz); //burada önceden kullanılan metod override edilmiş oldu ve alt sınıftakini çalıştırdı hayvan yerine köpek yazar
        // eğer başına super. ile çağırılsaydı üst sınıftakini çağırırdı
        // ama bir şey belirtmeden yazılırsa override işleme girer ve alt sınıftakini çalıştırır
        //override edilmeseydi üst sınıfı çağırır zaten çünkü class ı hayvandan extends ettik
    }
    public int getDis_sayisi(){
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi){
        this.dis_sayisi= dis_sayisi;
    }
}
