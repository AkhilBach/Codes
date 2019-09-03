import java.util.*;
import java.io.*;
class min
{
    public static void main(String args[])throws IOException
    {
        int[] a=new int[5];
        
        Scanner ir=new Scanner(System.in);
        
        for(int r=0;r<5;r++)
        {
            System.out.println("Enter no. "+(r+1));
            a[r]=ir.nextInt();
        }
        int max=a[0],min=a[0],sum=0;
        for(int w=0;w<5;w++)
        {
           int com=a[w];
           if(min>com)
           {
               min=com;
            }
            if(max<com)
            {
                max=com;
            }
            sum=sum+a[w];
        }
        System.out.println("Minimum Value:"+"\t"+min);
        System.out.println("Maximum Value:"+"\t"+max);
        System.out.println("Sum of elements:"+"\t"+sum);
    }
}
            