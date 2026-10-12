public class Main {
    public static void main(String[] args){
        ATM atm = new ATM(); //ATM üzerinden atm nesnesi ürettik
        Hesap hesap = new Hesap(2000,"1234","Azra Atabay");
        atm.calis(hesap); //ATM class ındaki calis methodunu çalıştırır. hesap nesnesinin bilgilerini kontrol edecek
        System.out.println("Programdan çıkılıyor...");//calis methodu bittikten sonra bu yazacak

    }

}
