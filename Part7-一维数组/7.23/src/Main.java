public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean[] cabinet = new boolean[100];
        for(int i = 0; i < cabinet.length - 1; i++)
        {
            cabinet[i] = false;
        }
        for(int i = 1; i <= cabinet.length - 1; i++)
        {
            for(int j = i; j <= cabinet.length - 1; j += i)
            {
                cabinet[j] = !cabinet[j];
            }
        }
        System.out.println("The cabinet ");
        for(int i = 0; i < cabinet.length - 1; i++)
        {
            if(cabinet[i])
            {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print("is open \nThere are " + count +  " open cabinets");
    }
}
