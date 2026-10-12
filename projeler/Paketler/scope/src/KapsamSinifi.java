public class KapsamSinifi {
    private int degisken = 30 ;

    public void dahiliSinifKontrol(){
        DahiliSinif d = new DahiliSinif();
        System.out.println("Kontrol ediliyor..."+ d.a);
    }

    public class DahiliSinif{
        private int degisken = 20;
        private int a = 3 ;

        public void onileCarp(){
            int degisken = 10; //en local olan bu olduğu içim method çağırıldığında bunu kullanır
            for (int i = 1 ; i<6 ; i++){
                System.out.println(i + " * "+ degisken+ " = "+ (i*degisken));
                System.out.println(i + " * "+ this.degisken+ " = "+ (i*this.degisken)); //bulunduğu classın değişkeninini kullanır(dahilisınıf)
                System.out.println(i + " * "+ KapsamSinifi.this.degisken+ " = "+ (i* KapsamSinifi.this.degisken));//burada kapsamsınıfının değişkeninini kullanmak istediğimizi belirtiyoruz
            }

        }
    }


}
