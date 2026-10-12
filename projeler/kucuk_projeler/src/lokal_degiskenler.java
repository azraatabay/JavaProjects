public class lokal_degiskenler {
    public static void toplama(int a, int b, int c){
        System.out.println("Toplam: " + (a+b+c));
    }

    public static void main(String[] args){
        // değişkenler tanımlı oldukları kod blokları arasında geçerlidir
        int a = 4;
        String yazdir = "merhaba";

        if(a<10){
            int b = 5;
            System.out.println(yazdir);
        }

        toplama(1,2,3);  // method olduğu için blok dışında da çalışır

        //System.out.println(b); bu kod hata üretir çünkü b değişkeni if bloğu içindeki bir lokal değişkedir
    }

}
