import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        OUT.print("1.Değeri giriniz: ");
        x = scanner.nextInt();
        OUT.print("2.Değeri giriniz: ");
        y = scanner.nextInt();
        OUT.print("3.Değeri giriniz: ");
        z = scanner.nextInt();

        if(x<y && x<z && y>z)
            OUT.println("Küçükten düyüğe sıralanması="+""+x+"-"+z+"-"+y);
       else if(y<x && y<z && x>z) {
            OUT.println("Küçükten düyüğe sıralanması="+"" + y + "-" + z + "-" + x);
        }
       else if(z<y && z<x && y>x)
            OUT.println("Küçükten düyüğe sıralanması="+""+z+">"+x+">"+y);

        else if(z>y && z>x && y>x)
            OUT.println("Küçükten düyüğe sıralanması="+""+x+">"+y+">"+z);
        else
            OUT.println("Yanlış sayı veya farklı karakter girdiniz.");

        scanner.close();
    }
}