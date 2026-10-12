import java.util.Scanner;

public class ebob_bulma {
    public static int ebobu_nedir(int a, int b){
        int ebob=1;
        for (int i = 1 ; i<=a && i<=b ; i++){
            if ((a%i==0 )&& (b%i==0)){
                ebob=i;
            }
        }
        return ebob;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1= scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Ebobları : " + ebobu_nedir(sayi1,sayi2));
    }

}