import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String userName, password, newPassword;
        int tus;

        Scanner giris = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = giris.nextLine();
        System.out.print("Şifreniz: ");
        password = giris.nextLine();

        if (userName.equals("Meşe Palamudu") && password.equals("123456")) 
        {
            System.out.println("Giriş başarılı.");
        } 
        else 
        {
            System.out.println("Bilgiler hatalı.");
            System.out.println("Eğer şifrenizi unuttu iseniz 0'a aksi halde tekrar denemek için 1'e basınız.");
            tus = giris.nextInt();
            
            switch(tus)
            {
                case 0:
                    System.out.print("Yeni şifreniz:");
                    newPassword = giris.nextLine();
                        if (newPassword != password) {
                            System.out.println("Şifreniz değiştirildi.");   
                        } 
                        else 
                        {
                            System.out.println("Eski şifrenizi tekrardan giremezsiniz.");
                        }           
                    break;

                default:
                    main(null);
            }
            giris.close();
            }
        }
    }