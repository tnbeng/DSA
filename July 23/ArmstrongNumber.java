class ArmstrongNumber
{
    public static void main(String args[])
    { 
        int num=1634;
        int n=num;
        
        int length=0;
        while(n>0)
        {
            n=n/10;
            length++;
        }
        int digit=0;
        int sum=0;
        int n1=num;
        while(n1>0)
        {
            digit=n1%10;
            sum=sum+(int)Math.pow(digit,length);
            n1=n1/10;
        }
        if(num==sum)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
    }
}