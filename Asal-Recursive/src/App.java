import java.util.Scanner;

public class App {
    
    static boolean asal(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return asal(n, i + 1);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = scanner.nextInt();        
        
        if (asal(n, 2))
            System.out.println(n + " sayısı asaldır.");
        else
            System.out.println(n + " sayısı asal değildir.");
        scanner.close();
    }
}