import java.util.Scanner;
public class App 
{   static String isPalindrome(String str)
    {   String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        if (str.equals(reverse))
            return str + " palindrom bir sözcüktür.";
        else
            return str + " palindrom bir sözcük değildir.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sözcük giriniz: ");
        String soz = scanner.nextLine();
        System.out.println(isPalindrome(soz));
        scanner.close();
    }
}