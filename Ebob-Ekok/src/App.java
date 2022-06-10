import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int sayiA, sayiB;
        int kontrol = 0;
        
        do {
            System.out.print("İlk sayıyı giriniz: ");
            sayiA = scanner.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            sayiB = scanner.nextInt();
            if (sayiA <= 0 || sayiA <= 0) {System.out.println("Değerler pozitif olmalı.");}
            else {kontrol = 1;}
        } while (kontrol != 1);
        
        if (sayiB < sayiA) {
            int yedek = sayiB;
            sayiB = sayiA;
            sayiA = yedek;
        }
        
        int i = sayiA;
        while (i >= 1) {
            if ((sayiA % i == 0) && (sayiB % i == 0)) {
                System.out.println("EBOB: " + i);
                break;
            } else {i--;}
        }

        int j = sayiB;
        while (j <= (sayiA * sayiB)) {
            if ((j % sayiA == 0) && (j % sayiB == 0)) {
                System.out.println("EKOK: " + j);
                break;
            } else {j++;}
        }
    scanner.close();
    }
}