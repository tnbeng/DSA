class MoveZero 
{
    static void display(int[] arr)
    { 
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
            {
                System.out.print(" ");
            }
        }
        System.out.print("]\n");
    }
    static void movedZeros(int arr[])
    {
        int count=0;
        for(int i=1; i<arr.length; i++)
        {
          if(arr[i]!=0)
          {
            arr[count++]=arr[i];
            //count++;
          }
        }
        // for(int i=count; i<arr.length;i++)
        // {
        //     arr[i]=0;
        // }
        while(count<arr.length)
        {
            arr[count++]=0;
        }
    }
    public static void main(String args[])
    {
        int arr[]={0,0,1,2,0,05,0,3,4};
        display(arr);
        movedZeros(arr);
        display(arr);
    }
}