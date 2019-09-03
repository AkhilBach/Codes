import java.io.*;
class account 
{
    public void main(String args[])throws IOException
    {
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("Enter Customer name");
String a=br.readLine();
System.out.println("Enter the Account Number");
String b=br.readLine();
System.out.println("Enter A if the Account is Savings");
System.out.println("Enter B if the Account is Current");
char c=(char)br.read();




