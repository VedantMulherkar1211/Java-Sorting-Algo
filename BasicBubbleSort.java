// Bubble sort using single dimensional array
import java.util.*;
public class BasicBubbleSort {

    public void bubble(int arr[])
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

    }
    public static void main(String arg[])
    {
        int arr[] =new int[10];
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("Enter your data");
        for(int i=0;i<10;i++)
        {
            arr[i]=s.nextInt();
        }

        BasicBubbleSort obj=new BasicBubbleSort();
        obj.bubble(arr);
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
