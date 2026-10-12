package com.azraatabay.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        zamanHesapla("LinkedList",linkedList);
        zamanHesapla("ArrayList", arrayList);

    }

    public static void zamanHesapla(String veri_tipi, List<Integer> list){
        //listin sonuna değer ekleme
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();
        for (int i = 0 ; i<1000000 ; i++){
            list.add(0,i); //araya eklemelerde sadece node değişimi olacağından linkedlist daha verimlidir
            //list.add(i); //burada kısa veriler için arraylist uzun veriler için linkedlist daha verimlidir
        }
        bitis = System.currentTimeMillis();
        System.out.println(veri_tipi + " ekleme süresi "+ (bitis-baslangic) + "ms");
    }

    //lniked listlerde başa ortaya vs bir şey ekleneceğinde daha verimli olur çünkü sadece bağlantıları değiştiriyor
    //arraylistte de ise ekledikten sonra kalanların yerlerini hepten kaydırdığı için büyük verilerde çok fazla zaman kaybı yaşanıri


}
