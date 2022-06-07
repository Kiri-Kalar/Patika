import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Double yarıcap = 0.0, alan = 0.0, cevre = 0.0, dalan = 0.0, aci = 0.0;

        System.out.println("Yarıçap: ");
        Scanner giris = new Scanner(System.in);
        yarıcap = giris.nextDouble();

        alan = Math.PI*yarıcap*yarıcap;
        cevre = Math.PI*yarıcap*2;

        System.out.println("Çevre:" + cevre);
        System.out.println("Alan:" + alan);

        System.out.println("Açı: ");
        aci = giris.nextDouble();

        dalan = (Math.PI*yarıcap*yarıcap*aci) / 360;
        System.out.println("Daire Dilimi Alanı:" + dalan);
        giris.close();
    }
}