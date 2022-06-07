import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int x;
        System.out.print("Sıcaklık değerini giriniz: ");
        x=scanner.nextInt();

        if(x<=5)
            System.out.println("Kayak yapılmaya uygun");
        else if(x>5 && x<=15)
            System.out.println("Sinema izlenmeye uygun");
        else if (x>15 && x<=25)
            System.out.println("Piknik yapılmaya uygun");
        else if(x>25)
            System.out.println("Yüzme yapılmaya uygun");
        else
            System.out.println("Değer aralığı dılında girdiniz.");

    }
}