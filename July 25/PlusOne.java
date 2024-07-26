import java.util.Arrays;
class PlusOne
{
    static void display(int[] arr)
    { 
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
            {
                System.out.print(" ,");
            }
        }
        System.out.print("]\n");
    }
    static int findBase(int num)
    {
        int n=1;
        for(int i=0;i<num;i++)
        {
            n=n*10;
        }
        return n;
    }
    static int[] plusOne(int[] arr)
    {
        int base=findBase(arr.length-1);
        int sum=0;
        for(int i=0;i<arr.length; i++)
        {
           sum=sum+arr[i]*base;
           base=base/10;
        }
       
       int result=sum+1;
       int n=result;
       int rem=0;
       int count=0;
       while(n>0)
       {
         n=n/10;
         count++;
       }
       int newArr[]=new int[count];
       for(int i=newArr.length-1;i>=0; i--)
       {
          rem=result%10;
          newArr[i]=rem;
          result=result/10;
       }
       return newArr;
    }
    public static void main(String args[])
    {
        int arr[]={9,9,9,9};
        // display(arr);
        System.out.println(Arrays.toString(arr));
        int[] newArr=plusOne(arr);
        display(newArr);
    }
}