public class Main
{
    public static void main(String[] args)
    {
        RegularPolygon regularPolygon = new RegularPolygon();
        regularPolygon.regularPolygon(10, 4, 5.6, 7.8);
        System.out.println(regularPolygon.getPerimeter() + "\n"
                + String.format("%.2f", regularPolygon.getArea()));
    }
}
class RegularPolygon
{
    int n;//边数
    double side;//边的长度
    double x;//多边形中点横坐标
    double y;//多边形中点纵坐标

    RegularPolygon()
    {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    double getPerimeter()
    {
        return this.n * this.side;
    }

    double getArea()
    {
        return (this.n * (Math.pow(this.side, 2))) / (4 * Math.tan((Math.PI / this.n)));
    }

    void regularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
