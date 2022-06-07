import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sayi = 0, toplam = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi % 2 == 1)
                toplam = toplam + sayi;
        }while(sayi>=0);

        System.out.println("Toplam: " + toplam);
        scanner.close();
    }
}
