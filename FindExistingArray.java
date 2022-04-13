import java.util.Scanner;

public class FindExistingArray {
    public static void main(String[] args) {
        boolean flag = false;
        int num [] = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 0; i< num.length; i++)
        {
            if(a==num[i])
            {
                flag = true;
                System.out.println("Found");

            }


        }
        if(flag==false)
        {
            System.out.println("Not found");
        }

    }
}
