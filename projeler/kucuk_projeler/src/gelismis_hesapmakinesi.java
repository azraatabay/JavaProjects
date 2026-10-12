import java.util.Scanner;

public class gelismis_hesapmakinesi {
    public static int cıkarma(int a,int b){
        return (a-b);
    }

    public static double bolme(int a , int b){
        return (a/b);
    }

    public static int toplama(int a, int b){
        return (a+b);

    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }

    public static int carpma (int a ,int b){
        return (a*b);
    }

    public static int carpma (int a ,int b, int c){
        return (a*b*c);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String islemler = "İŞLEMLER\n"
                +"1. Toplama İşlemi\n"
                +"2. Çıkarma İşlemi\n"
                +"3. Çarpma İşlemi\n"
                +"4. Bölme İşlemi\n"
                +"Çıkış için q'ya basınız.";
        System.out.println("******************************************");
        System.out.println(islemler);
        System.out.println("******************************************");

        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            else if(islem.equals("1")){
                System.out.print("Kaç sayı toplayacaksınız?(2 veya 3): ");
               int kacsayi= scanner.nextInt();

                if(kacsayi==2){
                    System.out.println("Birinci sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine(); //dummy hatasını önlemek için
                    System.out.println("Toplamları : "+ toplama(sayi1,sayi2));
                }
                else if (kacsayi==3){
                    System.out.println("Birinci sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine(); //dummy hatasını önlemek için
                    System.out.println("Toplamları : " + toplama(sayi1,sayi2,sayi3));
                }
                else {
                    System.out.println("Geçersiz değer girdiniz.");
                }
            }

            else if (islem.equals("2")){
                System.out.println("Birinci sayıyı giriniz: ");
                int sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int sayi2 = scanner.nextInt();
                scanner.nextLine(); //dummy hatasını önlemek için
                System.out.println("Farkları : " + (cıkarma(sayi1,sayi2)));
            }

            else if (islem.equals("3")) {
                System.out.println("Kaç sayı çarpacaksınız ? (2 veya 3): ");
                int kacsayi= scanner.nextInt();
                if(kacsayi==2){
                    System.out.println("Birinci sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine(); //dummy hatasını önlemek için
                    System.out.println("Çarpımları : "+ carpma(sayi1,sayi2));
                }
                else if (kacsayi==3){
                    System.out.println("Birinci sayıyı giriniz: ");
                    int sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz: ");
                    int sayi2 = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz: ");
                    int sayi3 = scanner.nextInt();
                    scanner.nextLine(); //dummy hatasını önlemek için
                    System.out.println("Çarpımları : " + carpma(sayi1,sayi2,sayi3));
                }
                else {
                    System.out.println("Geçersiz değer girdiniz.");
                }
            }

            else if (islem.equals("4")){
                System.out.println("Birinci sayıyı giriniz: ");
                int sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int sayi2 = scanner.nextInt();
                scanner.nextLine(); //dummy hatasını önlemek için
                System.out.println("Bölümleri : "+ bolme(sayi1,sayi2));
            }

            else {
                System.out.println("Geçersiz işlem seçtiniz...");
            }
        }


        }
    }

