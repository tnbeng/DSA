class PrefixWordOfString
{
    public static void main(String arrs[])
    {
        String stat="i love burger";
        String prefix="burg";

        String[] words=stat.split(" ");
        for(int i=0; i<words.length;i++)
        {
        //    if(words[i].indexOf(prefix)!=-1)
        if(words[i].startsWith(prefix))
           {
            System.out.println(i+1);
            return;
           }
        }
        System.out.println(-1);
    }
}
