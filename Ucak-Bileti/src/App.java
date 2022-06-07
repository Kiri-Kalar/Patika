import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        double tutar, mesafe, yas, tip;
        System.out.println("Gidilecek mesafeyi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        mesafe = scanner.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        yas = scanner.nextDouble();
        System.out.println("Tek yön bilet için 1'e, Gidiş/Dönüş bileti için 2'ye basınız: ");
        tip = scanner.nextDouble();

        if(Math.signum(mesafe) == 0 || (Math.signum(mesafe) == 1))
        {
            if(yas < 12 && tip == 1)
            {
                tutar = mesafe * .1;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .5;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas < 12 && tip == 2)
            {
                tutar = mesafe * .1 * 2;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .5 * .8;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>11 && yas<25 && tip == 1)
            {
                tutar = mesafe * .1;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .9;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>11 && yas<25 && tip == 2)
            {
                tutar = mesafe * .1 * 2;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .9 * .8;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>24 && yas<65 && tip == 1)
            {
                tutar = mesafe * .1;
                System.out.println("Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>24 && yas<65 && tip == 2)
            {
                tutar = mesafe * .1 * 2;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .8;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>64 && tip == 1)
            {
                tutar = mesafe * .1;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .7;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
            if(yas>64 && tip == 2)
            {
                tutar = mesafe * .1 * 2;
                System.out.println("Normal Fiyat: " + tutar + " TL");
                tutar = tutar * .7 * .8;
                System.out.println("İndirimli Fiyat: " + tutar + " TL");
                scanner.close();
            }
        }
        else
        {
            System.out.println("Hatalı girdi.");
        }
    }
}