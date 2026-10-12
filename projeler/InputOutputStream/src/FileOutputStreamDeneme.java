import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDeneme {
    public static void main(String[] args){
        FileOutputStream fos = null;
       // File file = new File("dosya.txt");
        //FileOutputStream dosyaya yazmak için kullanılır. O dosya yoksa da dosyayı oluşturur


        try {
            //fos = new FileOutputStream("dosya.txt");
            //Dosya varsa içeriğini siler, baştan yazar. Yoksa oluşturur.
            fos = new FileOutputStream("dosya.txt", true);
            //Dosya varsa mevcut içeriğin sonuna ekler, silmez. Yoksa oluşturur.

            //fos.write(65);
            //fos.write(74);

            //byte[] array = {101,75,66,68}; //yukarıdakileri silmedi sonunda ekledi o kodlar yoruma alınsa da önceden yazılanın sonuna ekledi
            String s = "Azra Atabay";
            byte[] s_array = s.getBytes();
            //burada s stringinin içindeki her karakterin byte karşılığını getBytes methodu ile aldık ve byte arrayi ile tuttuk
            fos.write(s_array);
            //bu şekilde her karakteri byte olarak tuttuğundan direkt yazdığımız şekilde txt dosyasında göreceğiz

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception oluştu.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
        } finally {
            try {
                fos.close();  //kaynakları gereksiz kullanmamak için açılan dosyayı kapatmak gerekir
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu. ");
            }
        }
    }
}
