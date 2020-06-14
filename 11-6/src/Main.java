public class Main
{
    public static void main(String[] args)
    {
        m(new Person());
        m(new Student());
        m(new GraduateStudent());
        m(new Object());
        m(new fuck());
    }
    public static void m(Object x)
    {
        System.out.println(x.toString());
    }
}
class Person extends Object
{
    @Override
    public String toString()
    {
        return "Person";
    }
}
class Student extends Person
{
    @Override
    public String toString()
    {
        return "Student";
    }
}
class GraduateStudent extends Student
{

}

class fuck extends Person
{

}

