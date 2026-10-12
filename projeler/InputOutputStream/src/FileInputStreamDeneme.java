import java.io.*;

public class FileInputStreamDeneme {
    public static void main(String[] args){
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("dosya.txt");
         /*   System.out.println("Okunan karakter : " + (char)(fis.read()));
            System.out.println("Okunan karakter : " + (char)(fis.read()));
            System.out.println("Okunan karakter : " + (char)(fis.read()));
            burada sıradan hangi karakter gelicekse o değer okunur char dönüşümü ile karakter karşılığı bastırılır
          */

           /* fis.skip(5); //skip metodu ile dosyada istediğimiz yere götürebiliriz burada 5. karakteri okur
            System.out.println("Okunan değer : "+ (char)(fis.read()));
            System.out.println("Okunan değer : "+ (char)(fis.read())); //5. karakterden sonraki değeri okur
okunacak hiçbir değer kalmadığında read -1 döner
            */

            int deger;
            String s ="";
          /*  while ((deger = fis.read()) != -1){
                s += (char)deger;
                //dosyayı baştan sona kadar okur
            }
           */
            System.out.println("Dosya içeriği : "+ s);
            System.out.println("******************************");
            int say = 0;
            fis.skip(5);

            while ((deger = fis.read()) !=-1){
                s += (char) deger;
                say++;

                if (say==10){
                    break;
                }
            }
            System.out.println("Dosyanın 5. yerinden itibaren 10 karakter : " + s);
        }
        catch (FileNotFoundException e) {
            System.out.println("File bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata oluştu.");
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }
                fis.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
    }
}
