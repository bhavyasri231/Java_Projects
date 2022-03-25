public class Circle8 {
    int radius;

    Circle8(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public double circumference()
    {
        return 2 * 3.14 * radius;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }

}
