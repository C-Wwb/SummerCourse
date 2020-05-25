import java.util.Arrays;
import java.util.GregorianCalendar;

import static com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap.get;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(get(GregorianCalendar.YEAR))
                + Arrays.toString(get(GregorianCalendar.MONTH))
                + Arrays.toString(get(GregorianCalendar.DAY_OF_MONTH)));
    }
}