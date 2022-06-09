import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi ; i++) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = sayi; i >= 0 ; i--) {
            for (int j = (sayi - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}