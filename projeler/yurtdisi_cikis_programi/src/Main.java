public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String sartlar = "--Yurtdışı çıkış kuralları--\n" +
                "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n" +
                "15 TL harç bedelinizi tam olarak yatırmanız gerekiyor\n" +
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";

        String message= "Yurdışı şartlarından hepsini sağlamanız gerekiyor.";

        while(true){
            System.out.println("************************************");
            System.out.println(sartlar);
            System.out.println("*************************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor...");
                Thread.sleep(3000); // 3 saniye bekleticek kontrol ediyomuş gibi
                if (yolcu.yurt_disi_harci() == false){
                    System.out.println(message);
                    continue;
                }

                System.out.println("Siyasi yasak kontrol ediliyor...");
                Thread.sleep(3000);
                if (yolcu.siyasi_yasak()== false){
                    System.out.println(message);
                    continue;
                }

            System.out.println("Vize durumu kontrol ediliyor...");
                Thread.sleep(3000);
                if (yolcu.vize_durumu()== false){
                    System.out.println(message);
                    continue;
                }

            System.out.println("İşlemleriniz tamamlandı. Yurtdışında çıkabilirsiniz.");
                break;
        }

    }
}