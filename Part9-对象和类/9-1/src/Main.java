import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        DecimalFormat d = new DecimalFormat("0.00");
        c.setRadius(1.0);
        System.out.println("The area of the circle of radius " + 1.0 + " is " + d.format(c.getArea()));
        c.setRadius(25);
        System.out.println("The area of the circle of radius " + 25 + " is " + d.format(c.getArea()));
    }
}
class Circle
{
    double radius;
    Circle()
    {
        radius = 1;
    }
    double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    double getPerimeter()
    {
        return Math.PI * 2 * radius;
    }
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}
