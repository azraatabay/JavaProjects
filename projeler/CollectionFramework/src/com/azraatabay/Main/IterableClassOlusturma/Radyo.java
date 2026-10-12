package com.azraatabay.Main.IterableClassOlusturma;
import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
    private ArrayList<String> kanallar_listesi = new ArrayList<String>();

    public Radyo(String[] kanallar){

        for (String s : kanallar){
            kanallar_listesi.add(s);
        }
    }
    @Override
    public Iterator<String> iterator() {
        //return kanallar_listesi.iterator();
        //burada kanallar_listesi arraylist olduğunu için kendi içinde iterator ı var biz onu kullanmış oluyoruz

        return new RadyoIterator();
    }
    public class RadyoIterator implements Iterator<String>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            if (index< kanallar_listesi.size()){
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public String next() {
            String deger = kanallar_listesi.get(index);
            index++;
            return deger;
        }
    }
}