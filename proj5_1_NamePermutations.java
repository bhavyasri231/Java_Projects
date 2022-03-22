import java.util.ArrayList;
import java.util.Scanner;

public class proj5_1_NamePermutations {
    public static void main(String[] args) {

        System.out.println("enter 5 full names (firstname followed by surname):");
        ArrayList firstname = new ArrayList();
        ArrayList lastname = new ArrayList();
        Scanner scan = new Scanner(System.in);

        String fullname[] = new String[5];

        for(int i=0;i<5;i++)
        {
            fullname[i] = scan.nextLine();
            String seperate[] = fullname[i].split(" ",2);
            firstname.add(seperate[0]);
            lastname.add(seperate[1]);
        }

        System.out.println("Permutations of names");

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(firstname.get(i)+" "+lastname.get(j));
            }
        }

    }
}
