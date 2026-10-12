import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;
    //inner classlar private alanlara direkt erişebilir

    public class Factorial{ //inner class
        public void faktoriyel(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            int fakt = 1;

            for (int i = 2 ; i<=sayi ; i++){
                fakt *=i;
            }
            System.out.println("Faktöriyel : "+ fakt);
        }
    }
    public class Asal { //inner class
        public boolean asal_mi(int sayi){
            int i =2;
            while (i<sayi){
                if (sayi%i ==0){
                    return false;
                }
                i++; //i artmazsa sonsuz döndüye girer
            }
            return true;
        }
    }

    public class Alan{ //inner class
        public class Daire_Alan{ //inner class
            public void daire_alan(int yaricap){ //inner class
                System.out.println("Dairenin alanı : " + (PI  * yaricap * yaricap)) ;
                //private olmasına rağmen PI yi direkt olarak kullanabiliyoruz inner classlarda
            }
        }
    }


}
