public class Ic_ice_fonk_exception {
    public static void ucuncu_fonsiyon() {
        // try {
        int a = 12 / 0;
        //}
        //catch (ArithmeticException e){
        //  System.out.println("Bir sayı sıfıra bölünemez. ");
    }


    public static void ikinci_fonksiyon() {
        try {
            ucuncu_fonsiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez");
        }
    }
        public static void birinci_fonksiton () {
            ikinci_fonksiyon();
        }
        public static void main(String[] args){
        birinci_fonksiton();
        }

    }

