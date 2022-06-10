import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        for(int i=sayi-1;i>=1 ; i--){if(sayi % i == 0){toplam = toplam + i;}}

        if(toplam == sayi){System.out.println(sayi + " mükemmel sayıdır.");}
        else{System.out.println(sayi + " mükemmel sayı değildir.");}
        scanner.close();
    }
}