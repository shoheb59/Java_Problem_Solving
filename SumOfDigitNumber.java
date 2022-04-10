import java.util.Scanner;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        int sum = 0, num,m;

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n > 0)
        {
            m=n%10;
            sum=sum+m;
            n=n/10;

        }
        System.out.println("Number is: " +sum);
    }
}
