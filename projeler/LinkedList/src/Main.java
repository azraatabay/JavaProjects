import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);
            if (karsilastir==0){ //iki değer eşitse
                System.out.println("Listenizde bu eleman zaten var.");
                return;  //metodu sonlandırmak için kullanıyoruz
            }
            else if (karsilastir<0) {
                //yeni değer iterator.next ten daha büyük
            }
            else if(karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }

    public static void main(String[] args){
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Eczane");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        listeyi_bastir(gidilecek_yerler);
        System.out.println("************************************");
        sirali_ekle(gidilecek_yerler,"Kütüphane");
        sirali_ekle(gidilecek_yerler,"Arsa");
        listeyi_bastir(gidilecek_yerler);
    }
}