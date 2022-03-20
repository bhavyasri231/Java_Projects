import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String adjective1,adjective2,adjective3,occupation1,occupation2,girl_name,place,clothing,
                hobby,boy_name,mans_name;

        System.out.println("Enter a girls name : ");
        girl_name = scan.nextLine();

        System.out.println("Enter a boys name : ");
        boy_name = scan.nextLine();

        System.out.println("Enter 3 adjectives : ");
        adjective1 = scan.nextLine();
        adjective2 = scan.nextLine();
        adjective3= scan.nextLine();

        System.out.println("Enter 2 occupations : ");
        occupation1 = scan.nextLine();
        occupation2 = scan.nextLine();

        System.out.println("Enter a mans name : ");
        mans_name = scan.nextLine();

        System.out.println("Enter a place name : ");
        place = scan.nextLine();

        System.out.println("Enter a hobby : ");
        hobby = scan.nextLine();

        System.out.println("Enter clothing type : ");
        clothing = scan.nextLine();


        System.out.println("There once was a " + adjective1 + " girl named " + girl_name +
                ", who was a " + adjective2 + " " + occupation1 + " in the kingdom of " + place + ". She loves to wear "
        + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 + " "+ occupation2 +" named "+
                boy_name + " but her father, king " + mans_name + " forbid her from seeing him.");
    }
}
