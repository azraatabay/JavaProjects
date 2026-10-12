public class deneme2{
    public static void main(String [] args){
        int i = 0;
        while (i<10){
            if(i ==3 || i==5){
                i++;
                continue;
            }
            System.out.println("i = "+ i);
            i++;
        }
    }
}