public class Yonetici extends Calisan{
    //subclass
    //extends Calisan yazarak Calisan classındaki bütün özellikleri miras almış oluyoruz
    // orada yazdıklarımızı ardık burada da kullanabiliriz
    private int sorumlu_kisi; //ekstra özellik

    public Yonetici(String isim, int maas , String departman, int sorumlu_kisi){
        super(isim, maas, departman); //super anahtar kelimesi ile Calisan classı içindeki constructordan bilgileri çağırmış olduk
        this.sorumlu_kisi = sorumlu_kisi; //bu özelliği calisan classında tanımlamadık yöneticiye özgü bir özellik oldu
    }
    public void zamYap(int zam_miktari){
        System.out.println("Çalışanlara "+ zam_miktari+" dolar zam yapıldı.");
    }
    public void bilgileriGoster(){
//        System.out.println("İsim : "+ getIsim());
//        System.out.println("Maaş : "+ getMaas());
//        System.out.println("Departman : "+getDepartman() );
        super.bilgileriGoster(); //bu şekilde de override işlemi yapabiliyoruz.
        //Calisan class ındaki methodun üstüne sorumlu kişi sayısını ekliyoruz
        System.out.println("Sorumlu kişi sayısı: "+ this.sorumlu_kisi);
    }

}
