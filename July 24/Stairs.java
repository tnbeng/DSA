class Stairs
{
    static int stairCaseClimbWay(int n)
    {
        if(n<=3)
        {
            return n;
        }
        int n1=2;
        int n2=3;
        int n3=0;
        for(int i=4;i<=n;i++)
        {
             n3=n1+n2;
             n1=n2;
             n2=n3;
        }
        return n3;
    }
    public static void main(String args[])
    {
        int n=6;

        System.out.println(stairCaseClimbWay(n));
    }
}