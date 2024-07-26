class PalindromeWordOfString
{
    public static boolean palindromeChecker(String str)
    {
        String reversedString="";
        for(int i=0; i<str.length();i++)
        {
            reversedString=str.charAt(i)+reversedString;
        }
        return str.equals(reversedString);
        
    }
    public static void main(String args[])
    {
        String str="Hi madaam.";

        String[]  words=str.split(" ");
        int n=words.length;
        words[n-1]=words[n-1].substring(0,words[n-1].length()-1);
        
        int count=0;
        for(String word: words)
        {
            if(palindromeChecker(word))
            {
                System.out.println(word);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No palindrome word present.");
        }
    }
}