class MisingNumber
{
    static int optimalMethod(int arr[])
    {
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int a=max;
        int b=max-arr.length;
        int actual_sum=a*(a+1)/2-b*(b+1)/2;
        
        return actual_sum-sum;
    }
    static int misingNum(int arr[])
    {
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        for(int i=min;i<=min+arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {

                if(i==arr[j])
                {
                  count++;
                }
            }
            if(count==0)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int[] arr={10,0,12};
        //System.out.println("Mising numer " +misingNum(arr));
         System.out.println("Mising numer " +optimalMethod(arr));

    }
}