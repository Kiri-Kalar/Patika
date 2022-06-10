public class App {
    public static void main(String[] args) throws Exception {

        int sayac = 0;
        for(int i=1;i<100;i++){
            for(int j=1;j<100;j++){
                if(i % j == 0) sayac++; 
            }
            if(sayac == 2) System.out.println(i);
            sayac = 0;
        }
    }
}