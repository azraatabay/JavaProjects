package com.azraatabay.list.Queue;
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id){
        this.isim= isim;
        this.id= id;
    }


    @Override
    public String toString() {
        return "Player{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        if (this.id< o.id){
            return -1;
        }
        else if (this.id>o.id){
            return 1;
        }
        return 0;

    }
}

public class Priority {
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

       /* for (Integer s : queue) {
            System.out.println(s);
        }   for-each döngüsünde öncelik sırasına göre eklemez */

        System.out.println(queue.peek());
        //queue.clear();
        System.out.println("*****************************");
        System.out.println(queue.contains(10));
        System.out.println(queue.contains(5));
        System.out.println("**********************************");


        while (!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor "+ queue.poll());
        }  // while döngüsü kullanıldığında öncelik sırası göz önünde bulundurulur.

        Queue<Player> queue1 = new PriorityQueue<Player>();
        queue1.offer(new Player("Azra",5));
        queue1.offer(new Player("Mert",1));
        queue1.offer(new Player("Çınar",100));
        while (!queue1.isEmpty()){
            System.out.println("Eleman çıkarılıyor : "+ queue1.poll());
        }


    }
}
