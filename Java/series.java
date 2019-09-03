import java.io.*;
class series
{
    public static void main(String args[])throws IOException
    {double s=0;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter 1 or 2");
        int a=Integer.parseInt(br.readLine());
        System.out.println("chose the num till the series can go");
        int b=Integer.parseInt(br.readLine());
        switch(a)
        {
        case 1:
        for(double d=4,c=0;c<b;c++)
        {
            s=s+ 1/d;
            d=d+4;
           
        }
          System.out.println("output:"+s);
          break;
          
        case 2:
        for(double d=4,c=1;c<=b;c++)
        {
            s=s+ 1/d;
            d=d*c;
            
        }
          System.out.println("output:"+s);
          break;
    
        }
    
}
}