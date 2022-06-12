import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double a, b, sonuc;
        int islem;


        Scanner giris = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        a = giris.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b = giris.nextDouble();

        System.out.println("İşlem Seçiniz: ");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("İşlem: ");
        islem = giris.nextInt();

        switch (islem) {
            case 1:
                sonuc= a + b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = a - b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = a * b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
      
                if ( b == 0)
                    System.out.println("Bir sayı sıfıra bölünemez.");
                else
                {
                    sonuc = (float) a / b;  System.out.println("Sonuç: " + sonuc);
                }
                break;
            default:
                System.out.println("Böyle bir işlem yok.");
        }

        giris.close();
    }
}