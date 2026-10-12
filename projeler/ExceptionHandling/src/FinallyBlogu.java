public class FinallyBlogu {
    public static void main(String[] args){
        //try catch blogunda exception oluşsa da oluşmasa da finally bloğu mutlaka çalışır
        //mutlaka yapılması gereken işlemler yazılır

        try {
            String s = null;
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası...");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor...");
        }
    }
}
