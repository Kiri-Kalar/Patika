import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner giris = new Scanner(System.in);
        double tutar, tutarA = 0.0;

        System.out.println("Ürün Tutarı: ");
        tutar = giris.nextDouble();
        tutarA = tutar;

        double kdv_tutar = (tutar>1000) ? (tutar = tutar + tutar*.08) : (tutar = tutar + tutar*.18);

        System.out.println("Ürün tutarı: " + tutarA);
        System.out.println("KDV dahil ürün tutarı: " + kdv_tutar);
        System.out.println("KDV tutarı: " + String.format("%.2f",(tutar - tutarA)));
        giris.close();
    }
}