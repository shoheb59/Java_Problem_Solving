import java.util.Scanner;

public class CapitalSmallLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String var = scanner.next();
        int AsciiValue = (int)var.charAt(0);

        if(AsciiValue >= 65 && AsciiValue <= 91)
        {
            System.out.println("This is a capital letter");
        }
        else
        {
            System.out.println("This is a small letter");
        }
    }
}
