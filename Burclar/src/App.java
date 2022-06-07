public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String x;
        int y;
        System.out.print("Ay: ");
        x = scanner.nextLine();
        System.out.print("Gün: ");
        y=scanner.nextInt();

        if(((x.equals("Şubat") || x.equals("Mart")) && (y>0 && y<21)) )
            System.out.println("Balık burcusunuz.");
        else if(((x.equals("Ocak") || x.equals("Şubat")) && (y>0 && y<23)) )
            System.out.println("Kova burcusunuz.");
        else if(((x.equals("Aralık") || x.equals("Ocak")) && (y>0 && y<21)) )
            System.out.println("Oğlak burcusunuz.");
        else if(((x.equals("Kasım") || x.equals("Aralık")) && (y>0 && y<21)) )
            System.out.println("Yay burcusunuz.");
        else if(((x.equals("Ekim") || x.equals("Kasım")) && (y>0 && y<21)) )
            System.out.println("Akrep burcusunuz.");
        else if(((x.equals("Eylül") || x.equals("Ekim")) && (y>0 && y<21)) )
            System.out.println("Terazi burcusunuz.");
        else if(((x.equals("Ağustos") || x.equals("Eylül")) && (y>0 && y<21)) )
            System.out.println("Başak burcusunuz.");
        else if(((x.equals("Temmuz") || x.equals("Ağustos")) && (y>0 && y<21)) )
            System.out.println("Aslan burcusunuz.");
        else if(((x.equals("Haziran") || x.equals("Temmuz")) && (y>0 && y<21)) )
            System.out.println("Yengeç burcusunuz.");
        else if(((x.equals("Mayıs") || x.equals("Haziran")) && (y>0 && y<21)) )
            System.out.println("İkizler burcusunuz.");
        else if(((x.equals("Nisan") || x.equals("Mayıs")) && (y>0 && y<21)) )
            System.out.println("Boğa burcusunuz.");
        else if(((x.equals("Mart") || x.equals("Nisan")) && (y>0 && y<21)) )
            System.out.println("Koç burcusunuz.");
        else
            System.out.println("Hatalı girdi.");
    }
}