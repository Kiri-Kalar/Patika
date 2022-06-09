import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi, toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }

        System.out.println("Basamaklar toplamı: " + toplam);
        scanner.close();
    }
}