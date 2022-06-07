import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double ucret, mesafe = 0.0;

        System.out.println("Gidilen Mesafe: ");
        Scanner giris = new Scanner(System.in);
        mesafe = giris.nextDouble();

        ucret = mesafe*2.2 + 10;
        Double yedek = (ucret<20) ? (ucret = 20) : ( ucret = ucret);
        System.out.println("Ücret:" + ucret);
        giris.close();

    }
}
