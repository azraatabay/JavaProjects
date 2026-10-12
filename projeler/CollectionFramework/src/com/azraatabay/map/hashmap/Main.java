package com.azraatabay.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10,"Java");
        hashMap.put(30,"Pyhton");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");
        hashMap.put(20,"deneme");

        //bir anahtar yalnızce bir kere oluşur değer birden fazla oluşabilir
        //burada 20 anahtarını birden fazla değere vermemize rağmen en sondaki değeri yazdırıyor
        System.out.println(hashMap);

        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(100));

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Anahtar : "+ entry.getKey()+ "-----> Değer : "+ entry.getValue());
        }



    }
}
