import java.util.Scanner;

class FiboPrimeSeries
{
    static int fiboForPosition(int n)
    {

    if(n==1 || n==2)
    {
        return 1;
    }
    int n1=1;
    int n2=1;
    int n3=0;
    for(int i=3; i<=n; i++)
    {
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }

    return n3;
    }

   static int primeForPosition(int n)
   {
     int count=0;
     int primeVar=2;
     while(count!=n)
     {
       if(primeChecker(primeVar))
       {
         count++;
       }
       primeVar++;
     }
     return primeVar-1;
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
    if(count==2)
    {
        return true;
    }
    else 
    {
        return false;
    }
   }
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
        System.out.print("Enter position of the series : ");
    
     int n=sc.nextInt();
    // int n=9;
    // System.out.println(fibo(n/2+1));
    // System.out.println(primeChecker(7));
    //System.out.println(primeForPosition(6));

    if(n%2==0)
    {
        System.out.println(primeForPosition(n/2));
    }
    else
    {
        System.out.println(fiboForPosition(n/2+1));
    }
    }
   }
   

}