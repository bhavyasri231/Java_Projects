import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Enter an integer : ");
        number = scan.nextInt();

        if(number%3 == 0)
            System.out.println(number + " is divisible by 3");
        else
            System.out.println(number + " is not divisible by 3");

    }
}
