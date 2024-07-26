import java.util.Arrays;

class SecondSmallestElement
{
    public static int secondsmallestEle(int arr[])
    {
        int min1=0;
        int min2=0;
        
        if(arr[0]<arr[1])
        {
            min1=arr[0];
            min2=arr[1];
        }
        else
        {
            min1=arr[1];
            min2=arr[0];
        }

        for (int i=2; i<arr.length; i++)
        {
            if(arr[i]<min1)
            {
               min2=min1;
               min1=arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
        }

        return min2;
    }

    public static void main(String args[])
    {
        int[] arr={4,19,8,9,20,0,3};

        // Arrays.sort(arr);
        // System.out.println("Using inbuild arrays the second largest element is  "+arr[1]);

        System.out.println("The second smallest element is "+secondsmallestEle(arr));

    }
}