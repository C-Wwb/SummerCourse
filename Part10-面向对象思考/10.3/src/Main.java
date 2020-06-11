public class Main
{

}
class MyInteger
{
    int value;
    MyInteger(int value)
    {
        this.value = value;
    }
    boolean isEven()
    {
        return this.value % 2 == 0;
    }
    boolean isOdd()
    {
        return this.value % 2 == 1;
    }
    boolean isPrime()
    {
        for(int i = 2; i < this.value; i++) {
            if(this.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    boolean isEven(int value)
    {
        return value % 2 == 0;
    }
    boolean isOdd(int value)
    {
        return value % 2 == 1;
    }
    boolean isPrime(int value)
    {
        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void parseInt(char[])
}
