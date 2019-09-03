import java.io.*;
class first
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the Sentence");
        String sentence=br.readLine();
        int l=sentence.length();
        for(int a=0;a<l;a++)
        {
            if(a==0)
            {
                char q=sentence.charAt(a);
            System.out.print(Character.toUpperCase(q)+".");
        }
        if(sentence.charAt(a)==' ')
        {
            char q=sentence.charAt(a+1);
            System.out.print(Character.toUpperCase(q)+".");
        }
    }
}
}
            
            