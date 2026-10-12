package generic_sınıflar;

public class Main {
    public static void main(String[] args){
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi ={1,2,3,4,5,6};
        String[] string_dizi = {"Java","Pyhton","C++","PHP"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Azra"),new Ogrenci("Mert"),new Ogrenci("Lalin")};

        CharYazdir.yazdir(char_dizi);
        System.out.println("***************************");
        StringYazdir.yazdir(string_dizi);
        System.out.println("***************************");
        IntegerYazdir.yazdir(integer_dizi);
        System.out.println("***************************");
        OgrenciYazdir.yazdir(ogrenci_dizi);
        System.out.println("************************");

        //Generic sınıf kullanarak birden fazla class tanımlamanın önüne geçmiş olduk
        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        yazdir_string.yazdir(string_dizi);
        yazdir_integer.yazdir(integer_dizi);
        yazdir_ogrenci.yazdir(ogrenci_dizi);
        System.out.println("*******************************************************************");

        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);




    }
    public static  <E> void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }

    }
}