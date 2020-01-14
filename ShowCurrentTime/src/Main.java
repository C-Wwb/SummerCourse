public class Main {

    public static void main(String[] args)
    {
        long TotalMilliSeconds = System.currentTimeMillis();
        long TotalSeconds = TotalMilliSeconds / 1000;
        long CurrentSeconds = TotalSeconds % 60;
        long TotalMinutes = TotalSeconds / 60;
        long CurrentMinutes = TotalMinutes % 60;
        long TotalHours = TotalMinutes / 60;
        long CurrentHours = TotalHours % 24;
        System.out.println("Current time is " + CurrentHours + " : " + CurrentMinutes + " : " + CurrentSeconds + " GMT ");
    }
}
