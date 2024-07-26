class Reverse
{
    public static int[] reverse(int arr[])
    {
        int newArr[]=new int[arr.length];
        int j=arr.length-1;

        for (int i=0; i<arr.length; i++)
        {
            newArr[j]=arr[i];
            j--;
        }
        System.out.println("J=== "+j);
        return newArr;
    }

    public static void optimisedReverse(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int temp=0;

        while(left<right)
        {
            temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;

            left++;
            right--;
        }

    }

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
        int[] arr={2,4,19,8,9,20,34};

        // int[] reverseArr=reverse(arr);
        System.out.print("Original array : ");
        display(arr);
        // System.out.print("Reversed array : ");
        // display(reverseArr);
        optimisedReverse(arr);
        System.out.print("Reversed array : ");
        display(arr);

        
    }
}