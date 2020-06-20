import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        GeometricObject geometricObject = new Circle(5);
        GeometricObject geometricObject1 = new Rectangle(5, 3, "white", true);

        java.util.Date date = new Date();
        System.out.println(geometricObject.getArea() + " " + geometricObject.getPerimeter());
        System.out.println(geometricObject1.getArea() + " " + geometricObject1.getPerimeter()
                + " " + geometricObject1.getColor("white") + " " + date);
    }
}
abstract class GeometricObject
{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject()
    {

    }
    protected GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor(String color) {
        return this.color;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
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
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter()
    {
        return 2 * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}

class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle()
    {

    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        super.setColor(color);
        super.setFilled(filled);
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

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
