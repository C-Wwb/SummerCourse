import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Course course = new Course("Data Structures");

        course.addStudent("Peter Jones");
        course.addStudent("Kim Smith");
        course.addStudent("Anne Kennedy");

        System.out.println("Number of students in course: " + course.getNumberOfStudent());
        String[] students = course.getStudents();
        System.out.println(Arrays.toString(students));
    }
}
class Course
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudent;
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void addStudent(String student)
    {
        students[numberOfStudent] = student;
        numberOfStudent++;
    }
    public void dropStudent(String student)
    {

    }
    public String[] getStudents()
    {
        return students;
    }
    public int getNumberOfStudent()
    {
        return numberOfStudent;
    }
}
