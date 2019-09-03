import java.io.*;
class Z
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter 1 for Fibonacci series till 10");
        System.out.println("Enter 2 for sum of an integer");
        int decision=Integer.parseInt(br.readLine());
        
        int input=0;
        if(decision==2)
        {
        System.out.println("Input an integer");
        input=Integer.parseInt(br.readLine());
    }
    

        switch(decision)
        {
            case 1:
            int p=0,b=1,c=0;
            System.out.println("The Fibonnaci Series");
            System.out.print(p+","+b);
            int i=3;
            while(i<=10)
            {
            c=p+b;
            System.out.print(","+c);
            p=b;
            b=c;
            i++;
            }
            
    
            break;
            case 2:
            int d=0;
            int output=0;
            
           
         while(input>0)
            {
                d=input%10;
                output=output+d;
                input=input/10;
            }
            System.out.println("The Sum:"+output);
            break;
            default:
            System.out.println("Wrong choice");
            break;
        }
    }
}
               
                                     
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                