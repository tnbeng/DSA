import java.util.Arrays;

class Median 
{

    public static void display(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[]={20,7,5,3,1,19,20};

        int len=arr.length;

        Arrays.sort(arr);
        System.out.println("Sorted array : ");
        display(arr);

        if(len%2==0)
        {
            int right=len/2;
            int left=right-1;
            System.out.println("Right "+ arr[right] + " Left "+ arr[left]);
            float median=(float)(arr[right]+arr[left])/2;
            System.out.println("Median is "+ median);
        }

        else 
        {
            int medianIndex = len/2;
            System.out.println("Median is "+arr[medianIndex]);
        }
    }
}