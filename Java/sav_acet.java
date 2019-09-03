import java.io.*;
class sav_acet
{
    int balance;
    void accept()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the Deposit");
        int a=Integer.parseInt(br.readLine());
        balance=balance + a;
    }
    void display()
    {
        System.out.println("The Balance Is:"+balance);
    }
    void interest()
    {
        int a=(10*1*balance)/100*12;
        System.out.println("the Interest is:"+a);
        balance=balance+a;
    }
     void withdrawal()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter th withdrawal amount");
        int f=Integer.parseInt(br.readLine());
        balance=balance-f;
    }
 
    
  public void main(String args[])throws IOException
        {
            
            accept();
            interest();
            withdrawal();
            display();
        }
    }