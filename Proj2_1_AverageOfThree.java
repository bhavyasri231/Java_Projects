import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three different real numbers");

        int num1,num2,num3;
        double average;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        average = (num1+num2+num3)/3.0;

        System.out.println("The average of "+ num1 + " , " + num2 + " and "+ num3 + " is : " + average);
    }
}
