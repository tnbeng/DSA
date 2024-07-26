class AddDigits
{
    public static int addDigits(int num)
    {
        if(num<10)
        {
            return 0;
        }
        return num/9==0?9:num%9;
    }
    public static void main(String args[])
    {
        int num=38;
        int res=addDigits(num);
        System.out.println(res);
    //     int sum=0;
    //     int digit=0;
    //    while(num>=10)
    //    {
    //     sum=0;
    //      while(num>0)
    //     {
    //         digit=num%10;
    //         sum=sum+digit;
    //         num=num/10;
    //     }
    //     num=sum;
    //    }

    //     System.out.println(sum);

    
    }
}