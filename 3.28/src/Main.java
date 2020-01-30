import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter r1`s x-, y-coordinates, width, and height:");
        double xCoordinates1 = input.nextDouble(),
               yCoordinates1 = input.nextDouble(),
               width1 = input.nextDouble(),
               height1 = input.nextDouble();
        System.out.println("Please enter r2`s x-, y-coordinates, width, and height:");
        double xCoordinates2 = input.nextDouble(),
                yCoordinates2 = input.nextDouble(),
                width2 = input.nextDouble(),
                height2 = input.nextDouble();

            if((xCoordinates2 - (width2 / 2)) > (xCoordinates1 - (width1 / 2))
                    && (xCoordinates2 + (width2 / 2)) < (xCoordinates1 + (width1 / 2))
                    && (yCoordinates2 - (height2 / 2)) > (yCoordinates1 - (height1 / 2))
                    && (yCoordinates2 + (height2 / 2)) < (yCoordinates1 + (height1 / 2)))
            {
                System.out.println("r2 is inside r1");
            }
            else if((xCoordinates2 - (width2 / 2)) > (xCoordinates1 - (width1 / 2))
                    || (xCoordinates2 + (width2 / 2)) < (xCoordinates1 + (width1 / 2))
                    || (yCoordinates2 - (height2 / 2)) > (yCoordinates1 - (height1 / 2))
                    || (yCoordinates2 + (height2 / 2)) < (yCoordinates1 + (height1 / 2)))
            {
                System.out.println("r2 overlaps r1");
            }
            else
            {
                System.out.println("r2 does not overlap r1");
            }
        }


}
