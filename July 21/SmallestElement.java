class SmallestElement
{
    public static int SmallestEle(int arr[])
    {
        int smallest=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]<smallest)
            {
               smallest=arr[i];
            }
        }

        return smallest;
    }

    public static void main(String args[])
    {
        int[] arr={2,4,19,8,9};

        System.out.println("Smallest element is "+SmallestEle(arr));

    }
}