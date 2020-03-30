public class Main
{
    public static void main(String[] args)
    {
        double[] array = new double[100];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = Math.random() * 100 + 1;
        }
        System.out.println("The average of array is: " + String.format("%.2f", average(array)));

    }
    public static double average(double[] array)
    {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum / array.length;
    }
}
