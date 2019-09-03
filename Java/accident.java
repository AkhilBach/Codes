import java.io.*;
class accident
{
    public static void main(String args[])throws IOException
    {
        String[] name=new String[75];
        int[] age=new int[75];
        char[] gender=new char[75];
        int twenty=0;
        int thirty=0,forty=0,female=0;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the Accident Record of 75 drivers");
        for(int a=1;a<=75;a++)
        {
        System.out.println("Enter the Accident Record of driver no."+a);
        System.out.println("Enter your name");
        name[a-1]=br.readLine();
        System.out.println("Enter your age");
        age[a-1]=Integer.parseInt(br.readLine());
        System.out.println("Enter F if you are a female");
        gender[a-1]=(char)br.read();
    }
    for(int a=0;a<75;a++)
    {
        if(age[a]<20)
        twenty++;
        if(20<=age[a] && age[a]<=30)
        thirty++;
        if(30<age[a])
        forty++;
        if(gender[a]=='F')
        female++;
    }
     System.out.println("Total no. of drivers below 20"+twenty);
     System.out.println("Total no. of drivers between 20 and 30"+thirty);
     System.out.println("Total no. of drivers babove 30"+forty);
     int per=female/75*100;
     System.out.println("Percentage of female drivers"+per);
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        