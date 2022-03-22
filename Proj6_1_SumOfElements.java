import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {

        int positiveNumber;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integers (To stop entering elements enter negative elements) : ");
        positiveNumber = scan.nextInt();

        while (positiveNumber >= 0)
        {
            numbers.add(positiveNumber);
            positiveNumber = scan.nextInt();
        }
        System.out.println("Sum of the elements are : "+calculateSum(numbers));

    }

    public static long calculateSum(ArrayList<Integer> elements)
    {
        long sum=0,length;
        length = elements.size();

        for (int index =0; index < length; index++)
        {
            sum += (long)elements.get(index);
        }
        return sum;

    }
}
