import java.util.Scanner;

public class DiscountDemo {
    public static void main(String[] args)

    {
        int totalCost, discount = 400;

        System.out.println("Enter total ammount of Shirt & Sharee: ");
        Scanner scanner = new Scanner(System.in);
        totalCost = scanner.nextInt();

        if(totalCost >5900 ||  totalCost <5900)
        {
            System.out.println("Without discount, Total cost: "  +totalCost);
        }
        if(totalCost == 5900)
        {
            int discountPrice = totalCost - discount;
            System.out.println("Total cost is: " + discountPrice );
        }
    }
}


