public class LocalInner {
    public static void main(String[] args){
        class Alan{ //local inner classlarda public, static gibi anahtar kelimeler kullanılmaz
            public void darienin_alani(int yaricap){
                System.out.println("Dairenin yarıçapı : "+ (Math.PI*yaricap*yaricap));

                //local inner classlar sadece metod içinde çağrılabilir
            }

        }
        Alan alan1 = new Alan();//nesne oluşturduk
        Alan alan2 = new Alan();

        alan1.darienin_alani(4);
        alan2.darienin_alani(7);
    }
}
