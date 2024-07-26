class SecondLargestElement
{
    public static int secondLargestEle(int arr[])
    {
        int max1=0;
        int max2=0;
        
        if(arr[0]>arr[1])
        {
            max1=arr[0];
            max2=arr[1];
        }
        else
        {
            max1=arr[1];
            max2=arr[0];
        }

        for (int i=2; i<arr.length; i++)
        {
            if(arr[i]>max1)
            {
               max2=max1;
               max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }

        return max2;
    }

    public static void main(String args[])
    {
        int[] arr={2,4,19,8,9,20};

        System.out.println("The second largest element is "+secondLargestEle(arr));

    }
}