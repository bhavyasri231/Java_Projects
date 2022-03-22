public class Circle {

    private double radius;

    Circle()
    {
        this.radius = 1.0;
    }

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
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
