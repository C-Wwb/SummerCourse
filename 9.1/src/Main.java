public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(40);
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight()
                + " " + rectangle.getArea() + " " + rectangle.getPerimeter());
        rectangle.setWidth(3.5);
        rectangle.setHeight(35.9);
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight()
                + " " + String.format("%.2f", rectangle.getArea()) + " " + String.format("%.2f", rectangle.getPerimeter()));
    }
}
class Rectangle
{
    double width;
    double height;
    Rectangle()
    {
        this.width = 1;
        this.height = 1;
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
        return width * height;
    }
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}
