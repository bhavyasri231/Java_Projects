import java.util.Scanner;

public class IceCreamDemo {
    public static void main(String[] args) {

        IceCream iceCream = new IceCream("vanilla",25,2);

        System.out.println("choose an option");
        System.out.println("1. To add a new Topping");
        System.out.println("2. To Display the existing toppings");
        System.out.println("3. To get name of icecream");
        System.out.println("4. To get cost of icecream");
        System.out.println("5. To get number of scoops of icecream");
        System.out.println("6. exit");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        while(option <= 5) {

            switch (option) {
                case 1:
                    System.out.println("Enter a new topping name:");
                    String toppingName = scan.next();
                    iceCream.addToppings(toppingName);
                    System.out.println("Successfully new topping added");
                    break;

                case 2:
                    System.out.println("The existing toppings are : ");
                    iceCream.printToppings();
                    break;

                case 3:
                    System.out.println("The name of icecream is : " + iceCream.getName());
                    break;

                case 4:
                    System.out.println("The cost of iceCream is : " + iceCream.getCost());
                    break;

                case 5:
                    System.out.println("The number od scoops of icecream is : " + iceCream.getNumScoops());
                    break;
            }

            option = scan.nextInt();

        }

    }
}


