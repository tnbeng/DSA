class Palindrome
{
    public static boolean isPalindrome(int num)
    {
        int n=num;
        int sum=0;
        int digit=0;
        while(n>0)
        {
            digit=n%10;
            sum=sum*10+digit;
            n=n/10;

        }
        return sum==num;
    }

    public static void main (String args[])
    {
        int n1=100;
        int n2=500;
        for(int i=n1;i<=n2;i++)
        {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}