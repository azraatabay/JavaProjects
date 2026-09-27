public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu){
        this.beybladeci= beybladeci;
        this.donusHizi=donusHizi;
        this.saldiriGucu= saldiriGucu;
    }

    public void saldır(){
        System.out.println(beybladeci+ " "+ saldiriGucu +" ve " + donusHizi + " ile saldırıyor.");
    }

    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor ");
    }

    public void bilgileriGoster(){
        System.out.println("Beyblade'ci ismi : "+ beybladeci);
        System.out.println("Saldırı gücü : "+ saldiriGucu);
        System.out.println("Dönüş hızı : "+ donusHizi);
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }
}



