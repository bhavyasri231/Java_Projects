import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int random_number = random.nextInt(100);
        int number, count = 0;

        System.out.println("Enter a number");
        number = scan.nextInt();
        count++;

        while (number != random_number)
        {
            if(number > 100 || number < 1)
                System.out.println("That was a wasted guess! Pick a number between 1 to 100 inclusive!");
            else if(number > random_number)
                System.out.println("Your guess was too high");
            else if(number < random_number)
                System.out.println("Your guess was too low");

            number = scan.nextInt();
            count++;
        }

        System.out.println("Congratulations! You guessed the number in " + count + " guesses! Thanks for playing!" );

    }
}
