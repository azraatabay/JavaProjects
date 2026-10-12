public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public void paraYatir(double miktar){
        bakiye +=miktar;
        System.out.println("Yeni bakiye" + bakiye);
    }

    public Account(){ //constructor tanımlıyor ismi class ismi ile aynı olmalı
        //System.out.println("Kendi yazdığımız constructor");
        /*this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim= "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok";*/
        this("Bilgi yok", 0.0,"Bilgi yok","Bilgi yok","Bilgi yok"); //bu kullanım ile aşağıdaki contructor çağırılıyor
        //yukarıdaki işlemlerin aynısını yapmış oluyor
    }

    public Account(String isim, String email, String telefonNo){
        this("Bilgi yok",0.0,isim, email,telefonNo);
        //burada yeni contructor oluşturduk hesap no ve bakiye bilgileri varsayılan değerler
        // diğer değerler de gönderilen değerler
    }

    //method overloading ile Account contructorundan bir tane daha oluşturabiliriz
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo=hesapNo;
        this.bakiye= bakiye;
        this.isim= isim;
        this.email = email;
        this.telefonNo= telefonNo;
    }

    public void bilgileriGoster(){
        System.out.println("Hesap no: "+ this.hesapNo);
        System.out.println("Bakiye : "+ this.bakiye);
        System.out.println("İsim: "+ this.isim);
        System.out.println("e-mail: "+ this.email);
        System.out.println("Telefon no: "+ this.telefonNo);
    }


    public void paraCekme(double miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye. Bakiye: " + bakiye);
        }
        else if (miktar>1500) {
            System.out.println("Bir günde 1500'den fazla çekemezsiniz.");

        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye"+ bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
