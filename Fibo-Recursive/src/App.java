import java.util.Scanner;

public class App {
    public static int fib(int n) {
        
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int N = scanner.nextInt();
        System.out.print(N + " Elemanlı Fibonacci Dizisi:");
        for(int i = 1;i < N;i++)
            System.out.println(fib(i));
    }
}