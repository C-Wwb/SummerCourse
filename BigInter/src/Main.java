import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class bigInter {
    public static void main(String[] args)
    {
        //�������
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of number1: ");
        int lengthOfNumber1 = input.nextInt();
        System.out.println("Please enter the length of number2: ");
        int lengthOfNumber2 = input.nextInt();
        //����������

        List<Integer> number1 = new LinkedList<Integer>();
        List<Integer> number2 = new LinkedList<Integer>();
        //��������

        for(int i = 0; i < lengthOfNumber1; i++)
        {
            number1.add(i);
        }
        for(int i = 0; i < lengthOfNumber2; i++)
        {
            number2.add(i);
        }
        //����ѭ�������ڶ���������ȣ��Ѵ���ѹ������

        int bigLength = Math.max(lengthOfNumber1, lengthOfNumber2);
        //ȡ������������ֵ


        if(lengthOfNumber1 < lengthOfNumber2)
        {
            for(int i = 1; i <= (lengthOfNumber2 - lengthOfNumber1); i++)
            {
                number1.add(0);
            }
        }
        if(lengthOfNumber2 < lengthOfNumber1)
        {
            for(int i = 1; i <= (lengthOfNumber1 - lengthOfNumber2); i++)
            {
                number2.add(0);
            }
        }
        //�������Ƚ�С���������

        System.out.println("bigNumber1:"+number1);
        System.out.println("bigNumber2:"+number2);
        //��ӡ��������

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers(String): \nnumber1 is: ");
        String number1 = input.next();
        System.out.println("number2 is: ");
        String number2 = input.next();*/
        List<Integer> m = addMethod(number1, number2, bigLength);//��������
        int count = 0;
        for(int i = m.size()-1; i >= 0; i--)
        {
            //��Ϊ��˳�ŷŽ�ȥ�ģ�����Ӧ�õ���ȡ������
            System.out.print(m.get(i));
            count++;
            if(count % 3 == 0)
            {
                System.out.print(" ");
            }
        }
    }
    public static List<Integer> addMethod(List<Integer> num1, List<Integer> num2, int n) {//д������ӵķ�������������
        List<Integer> sum = new LinkedList<Integer>();
        int tensDigits = 0; //�洢ʮλ�ϵ���
        for(int i = 0; i < n; i++)
        {
            int temp;
            if(tensDigits > 0)
            {
                temp = num1.get(i) + num2.get(i) + tensDigits;
                //��ʮλ���������Ǿ�Ӧ�ü���
                // ��ȡnum1��ÿһλ���ϻ�ȡnum2��ÿһλ���϶����ʮλ���֣��Ա�ʾ��λ
                tensDigits = 0;
            }
            else
            {
                temp = num1.get(i) + num2.get(i);
                //��ȡnum1��ÿһλ���ϻ�ȡnum2��ÿһλ�����ý�λ
            }
            //ÿ������λ�������������һ����
            if(temp >= 10)
            {//�����λ���֮���Ǹ�λ��
                int remainder = temp % 10;//��ÿ������Ľ����ӵ�������
                int consult = temp / 10;
                sum.add(remainder);
                tensDigits = consult;//���������ʮλ���ֵ�����������
                if(i == (n - 1))
                { //���ӵ����һλʱ��Ӧ�ð�ʮλҲ�Ž������
                    sum.add(tensDigits);
                }
            }
            else
            {
                //�����λ��Ӻ��Ǹ�λ��
                //ֱ�Ӽ���������
                sum.add(temp);
            }
        }
        return sum;//��������Ϊ����ֵ
    }
    public static List<Integer> creat(String number) /*throws Exception*/ {//��ʱû�õ�
        LinkedList<Byte> list = new LinkedList<Byte>();
        //����Ҫ�ж����������integer�Ƿ���һ��������ַ���
        //��һ���ַ�������һ��������һ��ģ��
        String mod = "[+|-]*(//d)*";
        //����0 - �����, /dСд����,/��ת���,��һ��б�ܱ�ʾ
        //Ҫ�ѵڶ���б�ܵ���������б��
        Pattern pt = Pattern.compile(mod);
        //ģʽƥ��,�ж��Ƿ���һ�������ı��ʽ
        Matcher match = pt.matcher(number);
        //���Խ������ַ�����ģ���Ƿ�ƥ��
        String strNumber = null;
        //�����²�ͬ�������ǼӺſ�ʼ���Ǽ��ſ�ʼ���浽�ַ�����
        if(!match.find())
        //�����������ַ����У����ܹ��ҵ�����ģ�������
        {
            System.out.println("wrong input");
            //throw new Exception("wrong input");
            //�׳��쳣
        }
        else
        {//�����������ַ����У��ܹ��ҵ�����ģ�������
            if(mod.startsWith("+") || mod.startsWith("-"))
            {
                strNumber = number.substring(1 , number.length() - 1);
                //��һ��λ�ÿ�ʼ��һ��λ�ý���
            }
            else
            {
                strNumber = number.substring(0 , number.length() - 1);
            }
        }
        //�ѳ��˷���λ������������ŵ�list����
        char[] strArray = strNumber.toCharArray();
        //���ַ����ŵ����鵱��
        for(int i = 0; i < strArray.length-1; i++)
        {
            //��list����������в���������
            list.add((byte) (strArray[i] - '0'));
        }
        return null;
    }
}