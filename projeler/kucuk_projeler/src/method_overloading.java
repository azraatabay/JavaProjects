public class method_overloading {
    public static void skorHesapla( String isim , int puan){
        System.out.println(isim + " adlı sporcunun " + puan + " puanı var.");
    }

    public static void skorHesapla(int puan){
        System.out.println("isimsiz sporcunun " +  puan + " puanı var.");
    }

    public static void skorHesapla( String isim){
        System.out.println(isim + " " +"adlı sporcunun hiç puanı yok.");
    }

    public static void main(String[] args){
        skorHesapla("azra");
        skorHesapla("azra", 4);
        skorHesapla(4);
        //burada bir methodu birden fazla şekilde kullanmış olduk farklı paramametreler ve farklı sayıda parametreler için.
    }

}
