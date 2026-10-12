public abstract class Sekil {
    private String isim; //özellik


    public Sekil(String isim){
        this.isim= isim;
    }

    public void ismini_soyle(){ //gövdeli method
        System.out.println("Bu obje "+ isim + " objesidir");
    }

    abstract void alani_hesapla(); //gövdesiz method alt sınıflar mutlaka yazmak zorunda
    //bu kısım diğer şekiller için farklı olacağından buluınduğu class ta tanımlanması daha doğru olur

    public void setIsim(){
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
    //abstract class larda özellil, gövdeli, gövdesiz methodlar bulunabilir
}
