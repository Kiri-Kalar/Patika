import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int sayac, sayi, min = 1, max = 1;

        System.out.print("Sayı adeti giriniz: ");
        sayac = scanner.nextInt();

        for (int i = 1; i <= sayac; i++){
            System.out.print( i + ".sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (i == 1){
                max = sayi;
                min = sayi;
            }
            if (sayi > max){
                max = sayi;
            }
            if (sayi < min){
                min = sayi;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        scanner.close();
    }
}