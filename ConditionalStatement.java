public class ConditionalStatement {
    public static void main(String[] args) {
        int num1= 23;
        int num2 = 25;
        int num3= 30;
        if (num1>=num2 && num1>=num3)
        {
            System.out.println("Max num is " +num1);
        }
        if(num2>=num1 && num2>=num3)
        {
            System.out.println("Max num is " +num2);
        }
        else
        {
            System.out.println("Max num is " +num3);
        }
    }
}
