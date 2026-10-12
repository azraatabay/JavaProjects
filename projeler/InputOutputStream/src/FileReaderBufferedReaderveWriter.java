import java.io.*;
import java.util.Scanner;

public class FileReaderBufferedReaderveWriter {
    public static void main(String[] args)  {
        try(Scanner scanner = new Scanner( new BufferedReader(new FileReader("ogrenciler.txt")))) {
            while (scanner.hasNextLine()){
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");
                if (array[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println("Öğrenci bilgisi : "+ ogrenci_bilgisi);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
            writer.write("Ali Ozan,İnşaat Mühendisliği\n");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu.");
        }
    }
}