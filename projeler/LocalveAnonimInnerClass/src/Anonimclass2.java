public class Anonimclass2 {
    public static void main(String[] args){
        AOgrenci ogrenci = new AOgrenci("Azra", 21){
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapılıyor..." +" İsim : "+ getIsim() + " Numara : "+ getNumara());
            }
        };
        ogrenci.selamla();
        ogrenci.kayit_yaptir();
    }

    public static abstract class AOgrenci{ //gövdeli bir metod eklediğimizde interfacelerden farklı olarak bunu static yapmamız gerekiyor
        private String isim;
        private int numara;
        public AOgrenci(String isim , int numara){
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim(){
            return isim;
        }
        public void setIsim(String isim){
            this.isim  = isim;
        }
        public int getNumara(){
            return numara;
        }
        public void setNumara(int numara){
            this.numara = numara;
        }

        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("Selamlar...");
        }
    }
}

