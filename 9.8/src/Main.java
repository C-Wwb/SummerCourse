public class Main
{
    public static void main(String[] args)
    {
        Fun fun1 = new Fun();
        fun1.setOn(true);
        fun1.setSpeed(fun1.FAST);
        fun1.setRadius(10);
        fun1.setColor("yellow");
        System.out.println(fun1.toString());

        Fun fun2 = new Fun();
        fun2.setOn(false);
        fun2.setSpeed(fun1.MEDIUM);
        fun2.setRadius(5);
        fun2.setColor("blue");
        System.out.println(fun2.toString());
    }
}
class Fun
{
    int SLOW;
    int MEDIUM;
    int FAST;
    int speed;
    boolean on;
    String color;
    double radius;
    Fun()
    {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return (!this.on) ? "fan is off"
                : "Fun {" +
                "speed = " + speed +
                ", radius = " + radius +
                ", isOn = " + on +
                ", color = '" + color + '\'' +
                '}';
    }
}
