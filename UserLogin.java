import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String _username = "Hasnat";
        String _password = "1234";

        System.out.println("Input your Username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        System.out.println("Input your password");
        String password = scanner.next();

        if (_username.contentEquals(username)  && _password.contentEquals(password))
        {
            System.out.println("login successfull");
        }
        else
        {
            System.out.println("Wrong Username or Pass ");
        }
    }
}
