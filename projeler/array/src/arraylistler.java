import java.util.ArrayList;

public class arraylistler {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<String>();
// arraylerden farklı genişletilebilir olmasıdır
        array.add("Mor ve Ötesi"); //.add metodu ile yeni eleman eklenir array e
        array.add("Duman");
        array.add("Pera");
        array.add("Cem Adrian");

        System.out.println(array.get(2)); // indeks değeri 2 olan değer getirir .get metodu ile yapılır
        System.out.println(array.size()); // arrayın boyutunu öğrenmek için .size() metodunu kullanırız

        for (String a : array){
            System.out.println(a);  //normal arraydeki gibi foreach ile ekrana bastırabiliriz
        }

        array.remove(0);
        array.remove("Pera");  // .remove metodu silme işlemi yapar. İndeks no veya değer vererek yapılabilir.
        System.out.println("--------------------------------------");
        for (int i = 0 ; i<array.size() ; i++){
            System.out.println(array.get(i));
        } //yukarıdaki ile aynı işi yapar ekrana dizideki değerleri bastırır

        array.add("Duman");

        System.out.println("---------------------------------------");
        System.out.println(array.indexOf("Duman")); //birden çok aynı değerden olsa da o değeri ilk gördüğü yerdeki indeks değerini döndürür
        System.out.println(array.lastIndexOf("Duman"));

        array.set(0,"Pera");// belirlenen indeksteki değeri değiştirmek için set metodu kullanılır
        System.out.println(array);

    }
}
