import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int boyut = 0, yedek = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi Boyutu:");
        boyut = scanner.nextInt();

        if(boyut > 0){
            int[] dizi = new int[boyut];
            for(int i = 0; i < boyut; i++){
                System.out.printf("Eleman %d:", i + 1);
                dizi[i] = scanner.nextInt();
            }
            System.out.println("Dizi: " + Arrays.toString(dizi));
            for(int i = 0; i < boyut; i++){
                for(int j = i+1; j < boyut; j++){
                    if(dizi[i] > dizi[j]){
                        yedek = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = yedek;
                    }
                }
            }
            System.out.println("Sıralı Dizi: " + Arrays.toString(dizi));
        }
        else{
            System.out.print("Hata");
            System.exit(0);
        }
        scanner.close();
    }
}