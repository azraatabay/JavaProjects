import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz.");
        String idmanlar = "---Geçerli idmanlar---\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat\n";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun.");

        System.out.print("Burpee sayısı : ");
        int burpee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Pushup sayısı : ");
        int pushup = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Situp sayısı : ");
        int situp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Squat sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız başlıyor.");

        while (idman.idmanBittiMi() == false){
            System.out.print("Hareket türü (burpee, pushup,situp,squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.haraketYap(tur,sayi);

        }
        System.out.println("İdmanını başarıyla bitirdin!");

    }
}