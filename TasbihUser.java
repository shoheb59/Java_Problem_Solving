import java.util.Scanner;

 public class TasbihUser {
     public static void main(String[] args) {
        Tasbih counter = new Tasbih();

        Scanner a  = new Scanner(System.in);
        String i = a.nextLine();

        while (i ==a.nextLine()) {
            counter.click();
        }




        System.out.println("There are " +counter.getValue());

        counter.reset();

        System.out.println("There are " +counter.getValue());


    }
}
