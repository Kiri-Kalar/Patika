import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double matematik, fizik, kimya, turkce, tarih, muzik, ortalama = 0.0;
        Scanner sonuc = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik = sonuc.nextDouble();
        System.out.println("Fizik Notunuz: ");
        fizik = sonuc.nextDouble();
        System.out.println("Kimya Notunuz: ");
        kimya = sonuc.nextDouble();
        System.out.println("Türkçe Notunuz: ");
        turkce = sonuc.nextDouble();
        System.out.println("Tarih Notunuz: ");
        tarih = sonuc.nextDouble();
        System.out.println("Müzik Notunuz: ");
        muzik = sonuc.nextDouble();
        
        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Sınav sonucunuz: " + ortalama);
        String durum = (ortalama>=60) ? "Sınıfı gectiniz." : "Sınıfta kaldınız.";
        System.out.println(durum);
        sonuc.close();

    }
}
