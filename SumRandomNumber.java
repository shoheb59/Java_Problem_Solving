public class SumRandomNumber {
    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        int randomNum1 =(int) (Math.random()*(max-min)+min);
        int randomNum2 = (int)(Math.random()*(max-min)+min);
        System.out.println("random num 1: " +randomNum1);
        System.out.println("random number 2: " +randomNum2);

        int sum = randomNum1 + randomNum2;
        System.out.println("sum is " +sum);

    }
}
