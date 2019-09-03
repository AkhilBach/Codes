import java.io.*;
class value  
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter a String");
        String a=br.readLine();
        char[] b=a.toCharArray();
        System.out.println("The ASCII code of the characters of the String are:");
        int d=0;
        for(int c=0;c<a.length();c++)
        {
            d=(int)b[c];
        System.out.print(d+";");
    }
}
}