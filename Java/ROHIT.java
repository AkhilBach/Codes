import java.io.*;
class ROHIT
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the String");
        String name=br.readLine();
        int l=name.length();
        name =name.toUpperCase();
        char na[]=name.toCharArray();
        int lit=0;
        for(int a=2;a<=l;a++)
        {
        lit=lit+2;
        }
        for(int a=0;a<l;a++)
        {
            for(int c=lit-(a*2);0<=c;c--)
            {
                for(int d=0;d<a;d++)
                {   
                System.out.print(na[d]);
            }
        for(int b=lit-(a*2);0<b;b--)
        {
            System.out.print(na[a]);
        }
        for(int d=a;0<=d;d--)
                {   
                System.out.print(na[d]);
            }
        System.out.println();
        break;
    }
}
for(int a=l-1;0<=a;a--)
        {
            for(int c=lit-(a*2);0<c;c--)
            {
                for(int d=0;d<a;d++)
                {   
                System.out.print(na[d]);
            }
        for(int b=lit-(a*2);0<b;b--)
        {
            System.out.print(na[a]);
        }
        for(int d=a;0<=d;d--)
                {   
                System.out.print(na[d]);
            }
        System.out.println();
        break;
}
}
}
}




    

        
