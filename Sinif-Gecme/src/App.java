import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double matematik, fizik, turkce, kimya, muzik, ortalama;

        Scanner giris = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        matematik=giris.nextDouble();
        if (matematik<0 || matematik>100)
            matematik = 0;

        System.out.println("Fizik notunuzu giriniz : ");
        fizik=giris.nextDouble();
        if (fizik<0 || fizik>100)
             fizik = 0;

        System.out.println("Turkce notunuzu giriniz : ");
        turkce=giris.nextDouble();
        if (turkce<0 || turkce>100)
            turkce = 0;

        System.out.println("Kimya notunuzu giriniz : ");
        kimya =giris.nextDouble();
            if (kimya<0 || kimya>100){
             kimya = 0;
        }

        System.out.println("Müzik notunuzu giriniz : ");
        muzik=giris.nextDouble();
        if (muzik<0 || muzik>100)
            muzik = 0;

        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;
        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama >= 55)
            System.out.println("Gectiniz.");
        else
            System.out.println("Kaldiniz.");
        giris.close();
        }
    }