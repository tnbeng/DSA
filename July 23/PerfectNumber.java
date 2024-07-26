class PerfectNumber
{
    static boolean perfectNumberChecker(int n)
    {
        int sum=0;
        for(int i=1; i<=n/2;i++)
        {
            
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return n==sum;
    }
    
    public static void main(String args[])
    {
        int n1=1;
        int n2=500;

        System.out.print("Perfect Number between "+n1+" and "+n2+ " -> ");
        for(int i=n1; i<=n2; i++)
        {
            if(perfectNumberChecker(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}