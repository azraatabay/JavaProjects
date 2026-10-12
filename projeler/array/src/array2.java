import java.util.Arrays;

public class array2 {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};

        if(a1==a2){
            System.out.println("Eşitler");
        }
        else{
            System.out.println("Eşit değiller");
        }
        System.out.println("*****************************************");
        if (Arrays.equals(a1,a2)){
            System.out.println("Eşit");
        }
        else {
            System.out.println("eşit değil");
        }
//a1==a2 denilince bellekte aynı objeyi gösterip göstermedikleri sorgulanır.
// Buradaki arraylerin içindeki değerler aynı olsa da bellekte farklı yerlerde tutulurlar
// eğer biz iki dizinin içeriğinin aynı olup olmadığını görmek istersek Arrays sınıfının içindeki equals methodunu kullanmalıyız
    }
}
