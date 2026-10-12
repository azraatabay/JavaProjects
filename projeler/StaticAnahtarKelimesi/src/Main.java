public class Main {
    public static void main(String[] args){
//yukarıdaki static i kaldırırsak main metodu direkt oluşmaz proje çalışmaz


        Seyirci seyirci1 = new Seyirci("Azra");
        Seyirci seyirci2 = new Seyirci("Mert");

        seyirci1.oyun_seyret();

        System.out.println("Seyirci sayısı : "+ Seyirci.getSeyirci_sayisi());//
        // getseyirci sayısı metodu static olduğundan direkt sınıf adından erişebildik

        //static değişken class a bağlı olduğundan direkt class adı üzerinden erişebildik

        System.out.println("Seyirci sayısı : "+ seyirci1.getSeyirci_sayisi());
        System.out.println("Seyirci sayısı : "+ seyirci2.getSeyirci_sayisi());
        //seyirci_sayisi özelliğini static olarak belirlediğim için aynı zamanda
        //oluşturduğumuz seyirci1 ve seyirci2 objeleri üzerinde de erişebildik.

        selamla();
        //aşağıda static olarak tanımladığımız için direkt çağırabildik
        //static olmasaydı selamla meteodunu var olmazdı obje oluşturarak çağırmamız gerekirdi

    }
    public static void selamla(){
        System.out.println("Selamlar...");
    }
}