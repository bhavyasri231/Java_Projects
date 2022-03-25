import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) throws IOException{

        ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();

            FileInputStream fis = new FileInputStream("rectangle_data.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String[] seperate = sc.nextLine().split(" ",2);
                int length = Integer.parseInt(seperate[0]);
                int width = Integer.parseInt(seperate[1]);
                rectangle.add(new Rectangle(length,width));
            }
            sc.close();
            for(Rectangle array : rectangle)
            {
                System.out.println(" The length of rectangle is : "+ array.getLength());
                System.out.println(" The width of rectangle is : "+ array.getWidth());
                System.out.println(" The area of rectangle is : "+ array.area());
                System.out.println(" The perimeter of rectangle is : "+array.perimeter());
            }

    }

}
