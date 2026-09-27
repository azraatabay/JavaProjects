import java.util.Scanner;

public class cok_boyutlu_array {
    public static void main(String[] args){
        //matris oluşturmak için

        int[] array = {1,2,3,4,5,6}; // tek boyutlu array

        int[][] array2 = new int[2][2];
        array2[0][0]=10;
        array2[0][1]=20 ;
        array2[1][0]=30;
        array2[1][1]=40;

        int[][] array3= {{10,20},{30,40}};
        //burada 0. satıra değerler eklemek istediğimizi söylüyoruz 10,20
        // 1. satıra da 30 ve 40 eklemek istediğimizi söylüyoruz

        System.out.println(array3[0][1]); //0. satırın 1. sütuna ulaşmakk için
        System.out.println("****************************************");


        int[][] array4 = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<2;i++){
            for (int j =0; j<2 ; j++){
                array4[i][j] = scanner.nextInt();
            }
        }
        System.out.println("*************************");
        for (int i =0; i<2;i++){
            for (int j =0; j<2 ; j++){
                System.out.print(array4[i][j]+ " ");
            }
            System.out.println(" ");
        }



    }

}
