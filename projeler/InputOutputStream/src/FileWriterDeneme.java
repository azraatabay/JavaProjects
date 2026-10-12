import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDeneme {
    public static void main(String[] args){
        FileWriter writer = null;
        //burada writer ı null olarak başa yazmamızın sebebi eğer biz içeride belirtseydik yaşam döngüsü try catch bloğu kadar olacaktı ve finally bloğu yazarken hataya sebep olacaktı
        //Bu nedenle FileWriter classında türettiğimiz writer ı başta null veriyoruz değerini de aşağıda veriyoruz

        try {
            writer = new FileWriter("dosya.txt2",true); // true eklersen append eder yani önceki yazılanlara ekler yeni gelenleri o satırı yoruma alsak bile
            writer.write("Azra Atabay\n");
            //burada yazılan direkt txt dosyasnda görünüyor dönüşüme gerek kalmıyor
           // writer.write("Mert Gürhan\n");
            writer.write("deneme\n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştur");
        }
        finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken bir hata oluştu.");
                }
            }
        }

    }
}
