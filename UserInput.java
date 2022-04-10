import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try{
            System.out.println("Input a number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println("Your number is: " +num);
            scanner.close();
        }
        catch(Exception e){
            System.out.println("Please input a number only" +e);
        }

    }
}
