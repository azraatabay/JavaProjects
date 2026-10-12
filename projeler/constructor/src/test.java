public class test {
    public static void main(String[] args){
        Account account1 = new Account();

        System.out.println(account1.getEmail());
        System.out.println("*************************");

        Account account2 = new Account("azra", "example@gmail.com", "2342352");
        System.out.println(account2.getEmail()); //gönderilen değer
        System.out.println(account2.getBakiye());//varsayılan değer
        System.out.println("*************************");
        account2.bilgileriGoster();


//        account1.setHesapNo("123456");
//        account1.setBakiye(1000);
//        account1.setIsim("Azra Atabay");
//        account1.setEmail("azraatabay21@gmail.com");
//        account1.setTelefonNo("1234567");
//
//        System.out.println("Bakiye" + account1.getBakiye());
//        bu kısmı constructorlar sayesinde daha kolay yazabiliriz

//        Account account2 = new Account("12345",1000,"Azra Atabay", "azraatabay@gmail.com","1234567" );
//        account2.paraYatir(1500);
//        account2.paraCekme(2000);
    }
}
