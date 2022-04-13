import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int num [] = {11,55,22,21,45,76};
        Arrays.sort(num);
        //for (int iteam: num)
        //System.out.println(iteam);
        for (int i = num.length-1; i>=0 ; i--)
        {
            System.out.println(num);
        }
    }
}
