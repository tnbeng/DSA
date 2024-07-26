class StrongNumber 
{
    static int fact(int n)
    {
        int res=1;
        for(int i=1; i<=n; i++)
        {
           res=res*i;
        }
        return res;
    }
    public static void main(String args[])
    {
       int number = 145;
       int n=145;
       int digit=0;
       int res=0;
       while(n>0)
       {
          digit=n%10;
          res=res+fact(digit);
          n=n/10;
       }

      if(res==number)
      {
        System.out.println("Strong number");
      }
      else
      System.out.println("Not a strong number");
    }
}