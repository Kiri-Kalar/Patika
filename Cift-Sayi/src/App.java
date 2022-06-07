import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sayi = 0, cift = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for(int i=0;i<=sayi;i++)
        {
            if(i%2 == 0)
            {   
                cift++;
                System.out.println("Sayı: " + i);
            }
        }

        System.out.println("Çift sayı adeti: " + cift);
        scanner.close();
    }
}