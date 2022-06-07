import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Dik üçgen
        Scanner giris = new Scanner(System.in);
        double kısa, uzun, hipo = 0.0;
        System.out.println("Kısa Kenarı Giriniz: ");
        kısa = giris.nextDouble();
        System.out.println("Uzun Kenarı Giriniz: ");
        uzun = giris.nextDouble();
        hipo = Math.sqrt( (kısa*kısa) + (uzun*uzun));
        System.out.println("Hipotenüs: " + hipo);

        // Üçgen Alan
        double a, b, c, u, alan = 0.0;
        System.out.println("Kısa Kenarı Giriniz: ");
        a = giris.nextDouble();
        System.out.println("Uzun Kenarı Giriniz: ");
        b = giris.nextDouble();
        System.out.println("Uzun Kenarı Giriniz: ");
        c = giris.nextDouble();
        u = (a + b + c) / 2 ;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("Alan: " + alan);
        
        giris.close();
    }
}
