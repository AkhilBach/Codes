import java.io.*;
class SCORE
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
       String[] name=new String[3];
       int[] average=new int[3];
       int sum=0;
       int ca=0;
       int[] individual=new int[3];
       int[] mark=new int[3];
       for(int a=0;a<3;a++)
       {
           System.out.println("Enter the student name");
           name[a]=br.readLine();
           for(int b=1;b<=3;b++)
           {
               
           System.out.println("Enter the student's mark for test no.:" +b);
               mark[b-1]=Integer.parseInt(br.readLine());
            }
            for(int b=0;b<3;b++)
            {
                sum=sum+mark[b];
            }
            average[a]=sum/3;
            individual[a]=sum;
            sum=0;
        }
        for(int b=0;b<3;b++)
        {
            ca=ca+average[b];
        }
        int ave=ca/3;
        System.out.println("The class average is ="+ave);
        for(int b=0;b<3;b++)
        {
            System.out.println("Name:"+name[b]);
            System.out.println("individual score="+individual[b]);
            System.out.println("average="+average[b]);
        }
    }
}
            
                
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
      
            
       