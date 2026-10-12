package Uygulamalar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoş Geldiniz...");
        String sartlar = "---Yurtdışına Çıkış Kuralları---\n" +
                "Herhangi bir siyasi yasağının bulunmaması gerekiyor.\n" +
                "15 TL harç bedelinin ta olarak yatırılması gerekiyor\n" +
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.\n" ;
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";

        while (true){
            System.out.println("**************************************");
            System.out.println(sartlar);
            System.out.println("**************************************");

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.siyasiYasakKontrol();
            }
            catch (SiyasiException e){
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            try {
                yolcu.vizeDurumuKontrol();
            }
            catch (VizeException e){
                e.printStackTrace();
                continue;
            }
            System.out.println("İşlemleriniz tamamlandı. Yurtdışına çıkış yapabilirsiniz.");
            break;

        }
    }
}
