class LargestElement
{
    public static int largestEle(int arr[])
    {
        int largest=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
               largest=arr[i];
            }
        }

        return largest;
    }

    public static void main(String args[])
    {
        int[] arr={2,4,19,8,9};

        System.out.println("largest element is "+largestEle(arr));

    }
}