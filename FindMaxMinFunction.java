public class FindMaxMinFunction {
    public static void main(String[] args) {
        int num [] = {45,55,65,44,41,43,2,23};
        int max = findMax(num);
        System.out.println(max);
        int min = findMin(num);
        System.out.println(min);


    }
    static int findMax(int [] arr)
    {
        int max = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];

            }
        }
        return max;

    }
    static int findMin(int [] array)
    {
        int min = array[0];
        for(int i = 1; i <array.length; i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    }
}
