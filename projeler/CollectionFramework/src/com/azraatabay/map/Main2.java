package com.azraatabay.map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

 public class Main2 {
    static class Player{
        private String isim;
        private int id;

        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass()) return false;
            Player player = (Player) object;
            return id == player.id && Objects.equals(isim, player.isim);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isim, id);
        }

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public String toString() {
            return "| | | | ID : "+ id + " İsim : "+ isim;
        } //kendi oluşturduğumuz classların düzgün çalışması için toString methodunu override etmeliyiz
    }

     public static void main(String[] args){
        Set<Player> hashSet = new HashSet<Player>();
        Player player = new Player("azra",1);
        Player player2 = new Player("mert",10);
        Player player3 = new Player("çınar",6 );
        Player player4 = new Player("azra",1);

        hashSet.add(player);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for (Player p : hashSet){
            System.out.println(p);
        }



    }
}
