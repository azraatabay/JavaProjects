public class Main {

    public static void main(String[] args){
        Account account1 = new Account("azra atabay", "deneme@gmail.com","423542352");
        Account account2 = account1;

        // account1 Account objesini gösteriyor
        //account2 de account1 i gösteriyor yani ikisi de aynı yeri göstermiş oldular

        Account account3= new Account();
        //burada account3 bellekte başka bir yere yerleşti başka bir yeri gösteriyor
        if (account1==account3){
            System.out.println("Aynı objeyi gösteriyorlar...");
        }
        else{
            System.out.println("Aynı objeyi göstermiyorlar...");
        }
        System.out.println("*******************************");

        new Account("x kişisi", "deneme2@gmail.com","4234235").bilgileriGoster();
        //burada objeyi herhangi bir referansa atamadık. tek satırlık işlemlerde kullanılabilir bir sorun çıkmaz

    }
}
