import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a few Numbers:");
        int[] chaoticArray = new int[100];//��������
        List<Integer> orderlyArray = new ArrayList<Integer>();//��������
        for(int i = 0; i < 100; i++)
        {
            chaoticArray[i] = input.nextInt();//������������е���
            orderlyArray.add(chaoticArray[0]);
            if(chaoticArray[i] > orderlyArray.get(i))
            {
                orderlyArray.add(chaoticArray[i]);
            }

        }*/

        int [] arr = {3,2,5,8,6,4,9}; //��������
        int i ,j , k;
        for (i=1;i<arr.length;i++){
            k = arr[i]; //�������Ԫ��
            for (j=i-1;j>=0 && k<arr[j];j--){
                arr[j+1] = arr[j];
            }
            arr[j+1]=k;
        }
        System.out.println(Arrays.toString(arr));


    }
}
