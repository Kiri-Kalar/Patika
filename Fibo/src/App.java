import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int N = 0, sayiA = 0, sayiB = 1, toplam = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.print(N + " Elemanlı Fibonacci Dizisi:");
        
        int i = 1;
        while(i <= N){
            System.out.println(sayiA);
            toplam = sayiA + sayiB;
            sayiA = sayiB;
            sayiB = toplam;
            i++;
        }
        scanner.close();
    }
}