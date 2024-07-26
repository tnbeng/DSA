import java.util.HashMap;
// import java.util.Map;

class ContainsDuplicate
{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4};

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
           if(hm.containsKey(arr[i]))
           {
             System.out.println("Duplicate element present");
             return;
           }
           else
           {
              hm.put(arr[i],i);
           }
          
        }
        System.out.println("No duplicate element present");
    }
}