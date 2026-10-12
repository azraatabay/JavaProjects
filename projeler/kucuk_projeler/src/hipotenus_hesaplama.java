import java.util.Scanner;

public class hipotenus_hesaplama{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci dik kenarın değerini giriniz(örnek:1,2): ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci dik kenaarın değerini giriniz(örnek:4): ");
        double kenar2 = scanner.nextDouble();

        System.out.println("Hipotenüs değeri : "+ Math.sqrt(kenar1*kenar1+kenar2*kenar2));

    }
}