public class Main {
    public static void main(String[] args){
        class Alan{
            public void dairenin_alanı(int yaricap){
                System.out.println("Dairenin alanı : "+(Math.PI*yaricap*yaricap));
            }
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();

        alan.dairenin_alanı(3);
    }
}