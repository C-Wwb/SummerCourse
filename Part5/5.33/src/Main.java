public class Main
{
    public static void main(String[] args)
    {
        int get = 0;
        int sum = 0;
        int number = 0;
       while(number <= 10000)
       {
           number ++;
           for(int text = 1; text < number; text++)
           {
               if(number % text == 0)
               {
                   get = text;
                   sum += get;
               }
           }
               if(sum != number)
               {
                   sum = 0;
               }
               if(sum == number)
               {
                   System.out.println(number + " ");
                   sum = 0;
               }

       }
    }
}
