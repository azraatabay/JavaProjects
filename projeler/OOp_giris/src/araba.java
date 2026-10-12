public class araba {
    private String renk;
    private int kapılar;
    private int tekerlekler;
    private String motor;
    private String model;
    //araba nesnesi için bu özelliklerin hepsine sahip olacak.

    public void setModel(String model){ //methodlar objelere özgü olduğundan static kullanmıyoruz
                                        // static kullanırsak class lara özgü olur
                                        //setModel diyerek modele erişmek istediğimizi söylüyoruz
        this.model = model; //model objesini modele eşitledik
        // isimler aynı ise objenin özelliklerine erişmek için this kullanılır
        // model = model1 deseydik isimleri farklı olduğudan this kullanmaya gerek olmazdı
    }

    public String getModel(){ //get ile değer döndürmemize yarar
        return model; //return this.model de diyebiliriz
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public void setKapılar(int kapılar) {
        if (kapılar <0 ){
            System.out.println("Kapılar 0'dan küçük olamaz.");
        }
        else{
            this.kapılar = kapılar;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
// araba nesnesinden obje oluşturmak için bir tane daha java dosyası açmamız lazım
// o dosyaya da bir tane main metodu eklememiz lazım
//main metodu içinde obje oluşturabiliriz