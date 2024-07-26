class StringPalindrome
{
    public static String stringReverse1(String str)
    {
        String reversedString="";
        for(int i=0; i<str.length();i++)
        {
            reversedString=str.charAt(i)+reversedString;
        }
        return reversedString;
    }

    public static String stringReverse2(String name)
    {
        int left=0;
        int right=name.length()-1;
        char[] charArr=name.toCharArray();
      
        while(left<right)
        {
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }

        return new String(charArr);

    }
    public static void main(String args[])
    {
        String name="121 121";
       
        System.out.println("Original string: "+ name);
        
        String reversedString1=stringReverse1(name);
        String reversedString2=stringReverse2(name);

       System.out.println("Revered String1: "+reversedString1);
       System.out.println("Revered String2: "+reversedString2);

       if(name.equalsIgnoreCase(reversedString1))
       {
        System.out.print("Given string is a palindrome string ");
       }
       else
       {
        System.out.println("Given string is not a palindrome string ");
       }  

    }
}