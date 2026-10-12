public class Main{

        public static void array_bastir(int[] array){
            for (int i = 0 ; i < array.length ; i++){
                System.out.println("Element " + (i+1) + " : " + array[i]);
            }
        }

        public static double ortalama(int[] array){
            int toplam = 0 ;
            for (int i = 0 ; i<array.length ; i++){
                toplam += array[i];
            }
            return ((double) toplam/array.length);
        }
        public static void main(String[] args){
            int[] b = {10,20,30,40,50,60};
            array_bastir(b);

            int[] c = {1,2,3,4,5};
            System.out.println("Ortalama : "+ ortalama(c));
        }

}