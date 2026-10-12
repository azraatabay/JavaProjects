package com.azraatabay.list.siralama;

import java.util.*;

class KucuktenBuyugePlayer implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId()< o2.getId()){
            return -1;
        }
        else if (o1.getId()>o2.getId()){
            return 1;
        }
        return 0;
    }
}
class BuyuktenKucugePlayer implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId()<o2.getId()){
            return 1;
        }
        else if (o1.getId()>o2.getId()) {
            return -1;
        }
        return 0;
    }
}
class KucuktenBuyugeStringPlayer implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}


class BuyuktenKucugeString implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
public class Main{
    public static void main(String[] args){
        List<String> list_string = new ArrayList<String>();
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        Collections.sort(list_string);
        for (String s : list_string){
            System.out.println(s);
        }
        System.out.println("*********************************");

        List<Player> list_player = new ArrayList<Player>();
        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oğuz", 10));
        list_player.add(new Player("Yusuf", 4));

        Collections.sort(list_player);
        for (Player s : list_player){
            System.out.println(s);
        }
        System.out.println("************************************");
        Set<Player> treeset = new TreeSet<Player>();
        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oğuz", 10));
        treeset.add(new Player("Yusuf", 4));
        for (Player k : treeset){
            System.out.println(k);
        }
        System.out.println("*********************************");

        Collections.sort(list_player,new BuyuktenKucugePlayer());
        for (Player m : list_player) {
            System.out.println(m);
        }
        System.out.println("**********************************");
        Collections.sort(list_player,new KucuktenBuyugePlayer());
        for (Player p : list_player){
            System.out.println(p);
        }
        System.out.println("************************************");
        Collections.sort(list_player, new KucuktenBuyugeStringPlayer() );
        for (Player y: list_player ){
            System.out.println(y);
        }
        System.out.println("*****************************************");

        Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }

        });
        for (Player a : list_player){
            System.out.println(a);
        }
    }

}
class Player implements Comparable<Player> {
    private int id;
    private String isim;

    @Override
    public int compareTo(Player player) {
        if (this.id< player.id){
            return -1;
        }
        else if (this.id> player.id) {
            return 1;
        }
        return 0;
    }

    public Player(String isim , int id){
        this.isim= isim;
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "||| ID : " + id + " İsim : "+ isim+ "|||";
    }


}
