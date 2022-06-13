import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz.");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        desen(sayi, sayi, sayi);
        scanner.close();
    }
    static void desen(int sayiA, int sayiB, int sayiC){
        if (sayiA>0){
            System.out.print(sayiA + " ");
            sayiA = sayiA - 5;
            sayiC = sayiA;
            desen(sayiA, sayiB, sayiC);
        }
        else if(sayiA <= 0){
            System.out.print(sayiC + " ");
            sayiC = sayiC + 5;
            if (sayiB == sayiC){
                System.out.println(sayiB);
            }
            else{
                desen(sayiA, sayiB, sayiC);
            }
        }
    }
}