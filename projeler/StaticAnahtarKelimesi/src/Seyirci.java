public class Seyirci{
    private String isim;
    private static int seyirci_sayisi = 0 ; //static kullanarak sınıfa air bir özellik tanımlamış olduk

    public Seyirci(String isim){
        this.isim=isim;
        seyirci_sayisi++; // her seyirci oluştuğunda seyirci sayısı 1 artar
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getIsim(){
        return isim;
    }

    public static int getSeyirci_sayisi(){
        return seyirci_sayisi;
    }

    public void oyun_seyret(){
        System.out.println(isim + " oyun seyrediyor. ");
    }
}