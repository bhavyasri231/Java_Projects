import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("choose an option");
        System.out.println("1. To get circle radius");
        System.out.println("2. To set circle radius");
        System.out.println("3. To find area of circle");
        System.out.println("4. To find circumference of circle");
        System.out.println("5. exit");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        while(option <= 4) {

            switch (option) {
                case 1:
                    System.out.println("The radius of circle is : " + circle.getRadius());
                    break;

                case 2:
                    System.out.println("Enter the new radius : ");
                    double radius = scan.nextDouble();
                    circle.setRadius(radius);
                    System.out.println("New radius has been set");
                    break;

                case 3:
                    System.out.println("The area of circle is : " + circle.area());
                    break;

                case 4:
                    System.out.println("The circumference of circle is : " + circle.circumference());
                    break;
            }

            option = scan.nextInt();

        }


    }
}
