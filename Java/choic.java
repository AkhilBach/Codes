import java.io.*;
class choic
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter 1 or 2");
        int choice=Integer.parseInt(br.readLine());
        System.out.println("Enter the term");
         int n=Integer.parseInt(br.readLine());
         double s=0;
        switch(choice)
        {
            case 1:
            for(double d=1,w=4;d<=n;d++,w=w+4)
            {
                
                s=s + 1/w;
            }
             System.out.println("output"+s);
            break;
            case 2:
            for(int d=1;d<=n;d++)
            {
                double fac=1;
                for(double a=1;a<=d;a++)
                {
                    fac=fac*a;
                }
                s=s+(d/fac);
            }
            System.out.println("Output:"+s);
            break;
            default:
            System.out.println("Wrong Choice");
            
        }
    }
}
            
            