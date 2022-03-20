import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int package_number, total_courses, total_cost = 0;

        System.out.println("Enter Learning package number (1/2/3)2 : ");
        package_number = scan.nextInt();

        System.out.println("Enter total courses enrolled in a month : ");
        total_courses = scan.nextInt();

        if(package_number == 1)
        {
            if(total_courses > 2)
                total_cost = (total_courses-2)*6 +10;
            else
                total_cost += 10;
        }
        else if (package_number == 2)
        {
            if(total_courses > 4)
                total_cost = (total_courses-2)*4 +12;
            else
                total_cost += 12;
        }
        else if(package_number == 3)
        {
            if(total_courses > 6)
                total_cost = (total_courses-2)*3 +15;
            else
                total_cost += 15;
        }
        System.out.println("Total package cost per month is :" + total_cost);


    }
}
