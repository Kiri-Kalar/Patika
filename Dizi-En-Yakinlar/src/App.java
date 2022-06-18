import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] list = {15, 12, 788, 1, 1,-778, 2, 0};
        Arrays.sort(list);
        Scanner scanner = new Scanner(System.in);
        int yedek = 0;
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        for(int i = 0;i < list.length;i++){
            if(sayi > list[i])
                yedek = i;
        }
        for (int i : list)
            System.out.print(i + " ");
        System.out.println("");
        System.out.println("Girilen sayı: " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[yedek]);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[yedek + 1]);
        scanner.close();
    }
}