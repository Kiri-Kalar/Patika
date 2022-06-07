import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double armut = 0.0, elma = 0.0, domates = 0.0, muz = 0.0, patlican = 0.0, tutar = 0.0;
        Scanner giris = new Scanner(System.in);

        System.out.println("Armut kaç kilo: ");
        armut = giris.nextDouble();

        System.out.println("Elma kaç kilo: ");
        elma = giris.nextDouble();

        System.out.println("Domates kaç kilo: ");
        domates = giris.nextDouble();

        System.out.println("Muz kaç kilo: ");
        muz = giris.nextDouble();

        System.out.println("Patlıcan kaç kilo: ");
        patlican = giris.nextDouble();

        tutar = armut*2.14 + elma*3.67 + domates*1.11 + muz*.95 + patlican*5;
        System.out.println("Toplam Tutar: " + tutar);
        giris.close();
    }
}