public class Main {
    public static void main(String[] args){
        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_kaydi();
        System.out.println(muhendis1.mezuniyet_ortalaması(3.78));
        String[] tecrube = {"Arçelik", "Aselsan", "Havelsan", "Microsoft"};
        muhendis1.is_tecrubesi(tecrube);

        System.out.println("***************************************");

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] tecrube2 = {};
        String[] referans = {"Jef Bezos", "Steve Jobs"};
        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_kaydi();
        System.out.println(muhendis2.mezuniyet_ortalaması(2.31));
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referans_getir(referans);
        muhendis2.caliş();
    }
}