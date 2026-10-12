import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static int[] array_olustur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0 ; i<sayi ; i++){
            cikti[i]= scanner.nextInt();
        }
        return cikti;
    }

    public static void main(String[] args){
        int[] a = array_olustur(6);
        System.out.println(Arrays.toString(a));
    }
}
