public class Calisan { //superclass ya da baseclass
    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman){ //constructor tanımladık.
        this.isim = isim;
        this.maas = maas;
        this.departman= departman;
    }

    public void calis(){
        System.out.println("Çalışan çalışıyor...");
    }

    public void bilgileriGoster(){
        System.out.println("İsim : "+ isim);
        System.out.println("Maaş : "+ maas);
        System.out.println("Departman : "+ departman);
    }
    public void departmanDegistir(String yeni_Departman){
        System.out.println("Departman değiştiriliyor...");
        this.departman = yeni_Departman;
        System.out.println("Yeni departman"+ this.departman);

    }

    public String getIsim() {
        return isim;
    }

    public int getMaas() {
        return maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
