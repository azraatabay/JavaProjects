import java.util.Scanner;

public class deneme1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("İşlem numarasını giriniz: ");
        int islem = scanner.nextInt();
        switch(islem){  // switch yapısı açıldı parantez içine kontrol edilecek değişken yazıldı
            case 1 :  // girilen değer 1 olduğu durumda bu blok çqalışacak
                System.out.println("1. işlem");
                break;  // break yapısı sayesinde diğer bloklara geçmeden işlem sonlanır
            case 2 :
                System.out.println("2. işlem");
                break;
            case 3 :
                System.out.println("3. işlem");
                break;
            case 4 :
                System.out.println("4. işlem");
                break;
            default:  // eğer case lerden hiçbiri sağlanmazsa bu blok çalışır.
                System.out.println("Geçersiz işlem numarası girdiniz.");
                break; // yine aynı şekilde işlemi sonlandırır
 // switch-case yapısında break kullanılmazsa(koşul sağlandıktan sonraki) diğer bloklar koşulu sağlasa da sağlamasa da çalıştırılır
 // bu yapıda koşul sağlanan bloğu çalıştırdıktan sonra break görene kadar çalıştırmaya devam eder.

        }
    }
}
