import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double sayi, sonuc = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextDouble();
 
        System.out.println("The harmonic series is: ");
 
        for (double i = sayi; i > 0; i--) {
            sonuc = sonuc + (double)1 / i;
            System.out.println(sonuc + ", ");
        }

        scanner.close();
    }
}