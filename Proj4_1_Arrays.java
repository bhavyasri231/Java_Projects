import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter 5 integers");

        for(int i =0;i<5;i++)
        {
            array[i] = scan.nextInt();
        }

        System.out.println("After multiplying each array element with 2");

        for(int i =0;i<5;i++)
        {
            System.out.println(array[i]*2);
        }

    }
}
