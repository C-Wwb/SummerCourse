
public class Main
{
    public static void main(String[] args)
    {
        Object object = new Circle(1);
        displayObject(object);
        Object object2 = new Rectangle(1, 2);
        displayObject(object2);
    }
    public static void displayObject(Object object)
    {
        if(object instanceof Circle)
        {
            System.out.println("The circle area is " + ((Circle)object).getArea());
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle)
        {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
class GeometricObject
{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
class Circle extends GeometricObject
{
    private double radius;
    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter()
    {
        return this.radius * 2;
    }

    public void printCircle()
    {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + this.radius);
    }
}
class Rectangle extends GeometricObject
{
    private double width;
    private double height;
    Rectangle()
    {

    }

    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return this.width * this.height;
    }

    public double getPerimeter()
    {
        return 2 * (this.height + this.width);
    }
}