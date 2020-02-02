import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter point1(latitude and longitude) in degrees: ");
        double  latitude1 = input.nextDouble(),
                longitude1 = input.nextDouble();
        System.out.println("Please enter point2(latitude and longitude) in degrees: ");
        double  latitude2 = input.nextDouble(),
                longitude2 = input.nextDouble(),
                radianLatitude1 = Math.toRadians(latitude1),
                radianLongitude1 = Math.toRadians(longitude1),
                randianLatitude2 = Math.toRadians(latitude2),
                radianLongitude2 = Math.toRadians(longitude2),
                r = 6371.0,
                d = r * Math.acos(Math.sin(radianLatitude1) * Math.sin(randianLatitude2)
                 + Math.cos(radianLatitude1) * Math.cos(randianLatitude2) *
                        Math.cos(radianLongitude1 - radianLongitude2));
        DecimalFormat D = new DecimalFormat("0.00");
        System.out.println("The distance between the two points is " + D.format(d));

    }
}
