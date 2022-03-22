import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        ArrayList ages = new ArrayList();

        Scanner scan = new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            System.out.println("Enter name of a person followed by age ");
            names.add(scan.next());
            ages.add(scan.nextInt());
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
        }
    }
}
