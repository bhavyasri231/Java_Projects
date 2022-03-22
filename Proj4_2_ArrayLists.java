import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {

        int number,length;
        ArrayList array = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integers (To stop entering elements enter negative elements) : ");
        number = scan.nextInt();

        while (number >= 0)
        {
            array.add(number);
            number = scan.nextInt();

        }

        length = array.size();
        System.out.println("Elements in reverse order");

        for(int i=length-1 ; i>=0; i-- )
        {
            System.out.println(array.get(i));
        }
    }
}
