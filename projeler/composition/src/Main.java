public class Main {
    public static void main(String[] args ){
        Resolution resolution =new Resolution(1920,1080);
        Monitor monitor =new Monitor("VS197DE","ASUS", "18.5", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Shadow","Temperli Cam ");
        Anakart anakart = new Anakart("B250-PRO","ASUS", 10, "Windows 10");

        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);

        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();//Monitör objesinin referansı üzerinden bu methodu çağırdık
        pc.getAnakart().işletim_sistemi_yukle("Ubuntu 16.04");
        //composotion mantığında has a yani sahiplik ilişkisi vardır hepsi iç içe geçmiş çünkü
        //anakart, monitör vb bunların hepsi bilgisayarların birer bileşeni burada inheritance kullanılmaz.
        //bir şirketin çalışanları mantığında inheritance kullanılır. Çünkü bir şirkette herkes çalışandır ancak herkesin aynı aynı özellikleri vardır.
        //bir bütünün parçaları gibi projelerde composotion kullanılması uygundur

    }
}