import java.util.Scanner;

public class uc_sayidan_enbuyugunu_bulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayı: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayı: ");
        int sayi3 = scanner.nextInt();

        int max = -1;

        if (sayi1 >= sayi2 && sayi1 >= sayi3 ){ //büyük eşitti kullanılma neden eğer tüm sayılarda da eşit olabilir
            max = sayi1;
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            max = sayi2;

        }
        else{
            max = sayi3;
        }
        System.out.println("En büyük sayı: "+ max);
    }
}
