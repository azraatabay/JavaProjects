import java.io.IOException;
import java.util.Scanner;

public class ThrowsAnahtarKelimesi {
    public static void mekan_kontrol(int yas) throws IOException {  //IOException checked exception olduğu için throws ile belirtmeliyiz
        if (yas<18){
            throw new IOException();
        }
        else {
            System.out.println("Hoşgeldiniz...");
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas= scanner.nextInt();

        try {
            mekan_kontrol(yas);
        }
        catch (IOException ex){
            System.out.println("IOException oluştu");
        }
    }
}
