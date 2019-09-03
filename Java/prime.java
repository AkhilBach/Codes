class prime
{
    void num(int n)
    {
        int h=0;
        for(int a=1;a<=n;a++)
        {
            if(n%a == 0)
            {
                h++;
            }
        }
        if(h==2)
        System.out.println(n+"  is  a prime num");
        else
        System.out.println(n+"  is not a prime num");
    }
}
            
    
