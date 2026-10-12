public class TryCatchBloklari {
    public static void main(String[] args){
        /*
        try{
            int a = 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı sıfıra bölünemez.");
        }

        try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array in boyutunu aştınız.");
        }

        //try catch blokları sayesinde hataları yakaların programın çalışması durmaz
        */

        try {
            int a = 30/0;
            int b[] = {1,2,3,4,5};
            System.out.println(b[6]);
        }
        catch (ArithmeticException e ){
            System.out.println("Bir sayı sıfıra bölünemez");
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("Arrayin boyutunu aştınız. ");
        }
        catch (Exception e ){
            System.out.println("Bir hata oluştu");
        }  //bu şekilde birden fazla catch bloğu yazılacaksa özelden genele doğru yazılmalıdır

        System.out.println("Burası çalışıyor...");
    }
}
