import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) throws IOException {

        ArrayList<Circle8> circle = new ArrayList<Circle8>();


        FileInputStream fis = new FileInputStream("circle_data.txt");
        Scanner sc = new Scanner(fis);

        File f = new File("circles_output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        while (sc.hasNextLine()) {
            String string = sc.nextLine();
            int radius = Integer.parseInt(string);
            circle.add(new Circle8(radius));
        }
        sc.close();
        for (Circle8 array : circle) {
            System.out.println(" The length of circle is : " + array.getRadius());
            pw.write(" The length of circle is : " + array.getRadius());
            System.out.println(" The area of circle is : " + array.area());
            pw.write("The area of circle is : " + array.area());
            System.out.println(" The perimeter of circle is : " + array.circumference());
            pw.write(" The perimeter of circle is : " + array.circumference());
        }
        pw.close();

    }
}
