import java.util.Scanner;

public class App {

    public static boolean Palindrome(int sayi){

        int yedek = sayi, yedekbas = 0, yedekson = 0;

        while(sayi != 0){

            yedekbas = sayi % 10;
            yedekson = yedekson * 10 + yedekbas;
            sayi = sayi / 10;

        }

        if( yedekson == yedek )
            return true;
        else
            return false;

    }

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if(Palindrome(sayi))
            System.out.println(sayi + " palindrom sayıdır.");
        else
            System.out.println(sayi + " palindrom sayı değildir.");

        scanner.close();
    }
}
