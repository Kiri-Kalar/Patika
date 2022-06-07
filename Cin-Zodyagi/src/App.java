import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Doğum yılınız: ");
        x=scanner.nextInt();
        y=x%12;

        switch (y){
            case 0:
                System.out.println("Burcunuz: Maymun"); break;
            case 1:
                System.out.println("Burcunuz: Horoz"); break;
            case 2:
                System.out.println("Burcunuz: Köpek"); break;
            case 3:
                System.out.println("Burcunuz: Domuz"); break;
            case 4:
                System.out.println("Burcunuz: Fare"); break;
            case 5:
                System.out.println("Burcunuz: Öküz"); break;
            case 6:
                System.out.println("Burcunuz: Kaplan"); break;
            case 7:
                System.out.println("Burcunuz: Tavşan"); break;
            case 8:
                System.out.println("Burcunuz: Ejderha"); break;
            case 9:
                System.out.println("Burcunuz: Yılan"); break;
            case 10:
                System.out.println("Burcunuz: At"); break;
            case 11:
                System.out.println("Burcunuz: Koyun"); break;
        }
}}