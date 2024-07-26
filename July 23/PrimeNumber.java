class PrimeNumber
{
    static boolean isPrime(int n)
    {
        boolean status=true;
        if(n==2)
        {
            return true;
        }
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2; i<=n/2;i++)
        {
            
            if(n%i==0)
            {
                return false;
            }
        }
        return status;
    }

    static boolean primeChecker(int n)
    {
       int count=0;
       for(int i=1; i<=n; i++)
       {
          if(n%i==0)
          {
            count++;
          }
       }

       return count==2;
    }
    
    public static void main(String args[])
    {
        int n1=0;
        int n2=500;
        System.out.print("Prime Number between "+n1+" and "+n2+ " -> ");
        for(int i=n1; i<=n2; i++)
        {
            if(primeChecker(i))
            {
                System.out.print(i+" ");
            }
        }

        
    }
}