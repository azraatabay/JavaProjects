import java.util.Scanner;

public class simple_calculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String islemler = "-----Yapılabilecek İşlemler------\n"+
                        "1. Toplama İşlemi\n"
                        + "2. Çıkarma İşlemi\n"
                        + "3. Çarpma İşlemi\n"
                        + "4. Bölme İşlemi\n"+
                        "------------------------------------";
        System.out.println(islemler);

        System.out.print("Birinci sayıyı giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double b = scanner.nextDouble();

        String x = scanner.nextLine(); // dummy code

        System.out.print("İşlemi numarasını seçiniz: ");
        String islem = scanner.nextLine();

        switch (islem){
            case "1" :
                System.out.print("Toplam: " +a+b);
                break;
            case "2" :
                System.out.print("Farkı: " + (a-b));
                break;
            case "3":
                System.out.print("Çarpımı: " + a*b);
                break;
            case "4" :
                System.out.print("Bölümleri: "+ a/b);
                break;
            default:
                System.out.print("Geçersiz işlem seçimi...");
                break;
        }







    }
}
