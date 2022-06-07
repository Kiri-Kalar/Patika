import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double boy = 0.0, kilo = 0.0, vke = 0.0;
        Scanner giris = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = giris.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = giris.nextDouble();

        vke = kilo / (boy*boy);
        System.out.println("ücut Kitle İndeksiniz:" + vke);
        giris.close();
        
    }
}