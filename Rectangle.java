public class Rectangle {

    Rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    int length,width;
    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public double perimeter()
    {
        return 2 * (length+width);
    }

    public double area()
    {
        return length*width;
    }
}
