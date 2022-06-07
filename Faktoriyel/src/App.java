import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int fakt = 1, sayi = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for(int i=1;i<=sayi;i++)
            fakt = fakt*i;
        
        if(sayi == 0)
            fakt = 1;

        System.out.println("Faktöriyel: " + fakt);
        scanner.close();
    }
}