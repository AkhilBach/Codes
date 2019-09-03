import java.io.*;
class incometax
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age");
        int age=Integer.parseInt(br.readLine());
          System.out.println("Enter the Taxable Income");
         double income=Double.parseDouble(br.readLine());
           System.out.println("if the income is les than 1,60,000;press 1");
           System.out.println("if the income is greater than 1,60,000 & less than or equal to 5,00,000;press 2");
           System.out.println("if the income is greater than 5,00,000 & less than or equal to 8,00,000;press 3");
           System.out.println("if the income is greater than 8,00,000;press 4");
           
           int c= Integer.parseInt(br.readLine());
           System.out.println("Enter the Gender:M for male &F for female");
        char gender=(char)br.read();
       
         
          
           double tax=0;
         if(age>65 && gender!='M')
         {
              System.out.println("Wrong category");
            }
            if(age<=65&&gender=='M')
            {
             switch(c)
             {
                 case 1:
                 tax=0;
                 break;
                 case 2:
                 tax=income*10/100;
                 break;
                 case 3:
                 tax=income*20/100 + 34000;
                 break;
                 case 4:
                 tax=income*30/100 + 94000;
                 break;
                }
                 System.out.println("the Income Tax payable is ="+ tax);
                }
            }
        }
                      