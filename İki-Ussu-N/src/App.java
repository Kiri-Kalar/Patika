import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sayi = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for(int i=0;i<=sayi;i++)
            for(int j=0;j<(sayi/2);j++)
        {    
            if(Math.pow(2, j) == i)
                System.out.println("Sayı: " + i);
        }
        scanner.close();
    }
}