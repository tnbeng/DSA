class Subsequence
{
    static boolean subSeqCheck(String s,String ss)
    {
        int n1=0;
        int n2=0;
        int count=0;
        for(int i=0;i<ss.length();i++)
        {
            
            if(s.indexOf(ss.charAt(i))!=-1)
            {
              n2=s.indexOf(ss.charAt(i));
              count++;
            }
           
            if(n2<n1)
            {
                return false;
            }
            n1=n2;
        }
       return count==ss.length();
    }
    static boolean optimalMethod(String s,String ss)
    {
        int i=0;
        int j=0;
        while(i<s.length() && j<ss.length())
        {
            if(s.charAt(i)==ss.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i==s.length()-1)
        {
           return true;
        }
        else
           return false;
    }
    public static void main(String args[])
    {
        String s="ahbgdc";
        String ss="bac";
       System.out.println(subSeqCheck(s,ss));
    }
}