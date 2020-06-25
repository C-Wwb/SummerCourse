public class Main
{
    public static void main(String[] args)
    {
        Object[] object = {new Tiger(), new Chicken(), new Apple()};
        for (Object o : object) {
            if (o instanceof Edible) {
                System.out.println(((Edible) o).howToEat());
            }
            if (o instanceof Animal) {
                System.out.println(((Animal) o).sound());
            }
        }
    }
}

abstract class Animal
{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();
}

interface Edible
{
    public String howToEat();
}

class Tiger extends Animal
{

    @Override
    public String sound() {
        return "OHH";
    }
}

class Chicken extends Animal implements Edible
{
    @Override
    public String sound() {
        return "GII";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

abstract class Fruit implements Edible
{

}

class Orange extends Fruit
{
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}

class Apple extends Fruit
{
    @Override
    public String howToEat() {
        return "Apple: Make apple juice";
    }
}