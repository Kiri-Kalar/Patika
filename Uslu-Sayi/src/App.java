import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban sayı giriniz: ");
        a = scanner.nextInt();
        System.out.println("Üs sayı giriniz: ");
        b = scanner.nextInt();
        
        c = Math.pow(a, b);
        System.out.println("Sayı: " + c);
        scanner.close();
    }
}