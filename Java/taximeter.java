import java.io.*;
class taximeter
{
    int taxino;
    String name;
    int km;
    int bill;
    taximeter()
    {
        taxino=0;
    name="";
    km=0;
}
void input()throws IOException
{
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    System.out.println("Enter the taxi number");
    taxino=Integer.parseInt(br.readLine());
    System.out.println("Enter the taxi name");
    name=br.readLine();
    System.out.println("Enter the number of km travelled");
    km=Integer.parseInt(br.readLine());
}
void calculate()
{
if(km <= 1)
{
    bill=km*25;
}
if(1<km && km<=6)
{
bill=km*10;
}
if(6<km && km<=12)
{
    bill=km*15;
}
if(12<km && km<=18)
{
    bill=km*20;
}
if(km > 18)
{
    bill=km*25;
}

}
void display()
{
System.out.println("Taxino"+"\t"+"Name"+"\t"+"Kilometers travelled"+"\t"+"Bill Amount");
System.out.println(taxino+"\t"+name+"\t"+km+"\t"+bill);
    }
public static void main(String args[])throws IOException
{
    taximeter obj=new taximeter();
    obj.input();
    obj.calculate();
    obj.display();
}
}
    