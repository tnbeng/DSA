class LengthOfLastWord
{
    public static void main(String args[])
    {
        String sent="  I am a honest boy ";
        int len=sent.length()-1;
        
        while(sent.charAt(len)==' ')
        {
            len--;
        }

        int count=0;

        while(len>=0 && sent.charAt(len)!=' ')
        {
            count++;
            len--;
        }

      

        System.out.println("Length of the last word is count "+ count);
    }
}