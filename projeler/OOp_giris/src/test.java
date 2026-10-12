public class test {
    public static void main(String[] args){
        araba araba1 = new araba(); // araba objesi oluşturmuş olduk araba nesnesinden araba1 objesi

        araba1.setModel("Citroen"); //arabanın mevcut modeli üzerinde değişiklik yaptık
        System.out.println("Arabanın modeli "+ araba1.getModel());
        // araba1.getModel() oluşturduğumuz araba1 objesi ile bilgiyi getirdik
        araba1.setKapılar(-4);

        /*araba araba2;
        araba2.setKapılar(10);
        burada java hata verir çünkü obje ataması yapmadık
        */

       // araba araba3 = null; //hata vermez çünkü bu referans henüz herhangi bir yeri göstermiyor diyor
        //araba3.setModel("Tesla");//hata verir
        //hata! senin bir referansın var ama referansa herhangi bir obje atamadın ama erişmeye çalışıyorsun diyor



    }
}
