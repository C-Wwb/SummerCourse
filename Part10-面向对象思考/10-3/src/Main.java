import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BMI bmi = new BMI("DYJ", 20, 165, 59.5);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());
    }
}
class BMI
{
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double PER_POUND = 0.4535927;
    public static final double PER_INCH = 0.0254;
    public BMI()
    {
        this.name = "DYJ";
        this.age = 20;
        this.weight = 59;
        this.height = 165;
    }
    public BMI(String name, int age, double weight, double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI()
    {
        double bmi = this.weight * PER_POUND / Math.pow((this.height * PER_INCH), 2);
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus()
    {
        double bmi = getBMI();
        if (bmi < 18.5)
        {
            return "Underweight";
        }
        else if (bmi < 25)
        {
            return "Normal";
        }
        else if (bmi < 30)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }
}
