import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

		int yil ;
		Scanner scanner = new Scanner(System.in);
		System.out.println( " Yılı giriniz: " );
		yil = scanner.nextInt();

		if ( yil > 0 ) 
        {
	        if ( yil%4 == 0)
            {
	            if ( yil % 100 == 0 )
                {
	                if ( yil % 400 == 0 )
                        System.out.println( yil + " artık yıl." );
	                else
	                    System.out.println( yil + " artık yıl değil." );
	            }
                else
	                System.out.println( yil + " artık yıl." );
	        }
            else
	            System.out.println( yil + " artık yıl değil." );
	    }
        else 
	        System.out.println( "Hatalı girdi." );
	}
}