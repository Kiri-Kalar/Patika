import java.util.Scanner;

public class App {

    static int Uslu(int a, int b){

        if(b != 0)
            return a * Uslu(a, b-1);
        else
            return 1;
        
    }
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Taban değerini giriniz: ");
        a = scanner.nextInt();
        System.out.println("Üs değerini giriniz: ");
        b = scanner.nextInt();

        System.out.println("Sonuç:" + Uslu(a, b));
        scanner.close();
    }
}
