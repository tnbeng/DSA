import java.util.HashMap;
import java.util.Map;

class RepeatFrequency
{
    public static void bruteForceMethod(int[] arr)
    {
        int[] freq=new int[arr.length];
        int visited=-1;

        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(freq[i]!=visited)
             {
              for(int j=i+1;j<arr.length; j++)
              {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=visited;
                }
              }
             System.out.println(arr[i]+" "+count);
             }
            
        }
    }
    public static void optimisedMethod(int[] arr)
    {
       HashMap <Integer,Integer> hm=new HashMap();

       for(int i=0; i<arr.length; i++)
       {
         if(hm.containsKey(arr[i]))
         {
            hm.put(arr[i],hm.get(arr[i])+1);
         }
         else
         {
            hm.put(arr[i],1);
         }
       }
       System.out.println("Element : Frequency");

       for(Map.Entry entry: hm.entrySet())
       {
        System.out.println(entry.getKey()+"  "+entry.getValue());
       }
    }

    public static void main(String args[])
    {
        int[] arr={10,20,20,10,10,5,20};

        optimisedMethod(arr);
        //bruteForceMethod(arr);
        
    }
}