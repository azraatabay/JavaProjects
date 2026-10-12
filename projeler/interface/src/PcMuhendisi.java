public class PcMuhendisi implements IMuhendis {
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil){
        this.askerlik=askerlik;
        this.adli_sicil=adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik){
            System.out.println("Askerliğimi yaptım");
        }
        else{
            System.out.println("Askerliğimi yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam : "+ derece;
    }

    @Override
    public void adli_sicil_kaydi() {
        if (adli_sicil){
            System.out.println("Adli sicil kaydım var.");
        }
        else {
            System.out.println("Adli sicil kaydım yok.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım : ");
        for (int i = 0 ; i<array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
