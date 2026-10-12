public class metodlarda_return {
    public static int toplama(int a,int b, int c){ //buradaki void kalırsa dışarıda kullanılamaz
        //System.out.println("toplamları : " + (a+b+c));
        return (a+b+c);
    }
    public static int iki_ile_carp(int a ){
        return a*2;
    }

    public static int iki_ile_topla(int a){
        return a+2;
    }

    public static int dort_ile_carp(int a){
        return a*4;
    }

    public static int deneme(int a) {
        System.out.println("Çıktı veriliyor...");
        return a*2;
        //System.out.println("Çıktı veriliyor..."); burada hata verir çünkü returnden sonra method çalışmaz
    }

    public static void main(String[] args){
        toplama(1,2,3);
        System.out.println("Toplam : " + toplama(1,2,3));

        System.out.println("Sonuç: " +(dort_ile_carp(iki_ile_topla(iki_ile_carp(8)))));
        System.out.println(deneme(4));

    }
}

//return değer döndürmemizi sağlar. çıktı almamızı sağlar. bir methottaki değeri başka bir fonksiyonda kullanılmak için return kullanılmalı
//void çağırdlığı yere hiçbir şey döndürmez
//return methodlarda en son çalışan koddur. returnden sonrakiler çalışmaz hata veririr.