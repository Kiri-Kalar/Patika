import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısı:");
        int x = scanner.nextInt();
        System.out.println("Sütun sayısı:");
        int y = scanner.nextInt();
        MineSweeper mine = new MineSweeper(x, y);
        mine.run();
        scanner.close();
    }
}