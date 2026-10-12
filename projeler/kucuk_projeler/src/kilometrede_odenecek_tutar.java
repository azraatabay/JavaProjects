import java.util.Scanner;
public class kilometrede_odenecek_tutar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınızla kaç kilometre gittiniz (ör:1,6): " );
        double km = scanner.nextDouble();
        System.out.println("Kilometre: " + km);

        System.out.print("Aracınızım kilometrede ne kadar yakıyor (ör: 4,6): ");
        double price = scanner.nextDouble();
        System.out.println("Aracınızın kilometrede yaktığı tutar : " + price);

        System.out.println("Toplam tutar" +price*km);

    }

}
