class arrange
{
    void input(String o)
    {
        String[] store={"AKHIL","ANSHUL","HIMANSHU","ARPIT","LAVIN"};
        int l=store.length;
        switch(o)
        {
        case "bubble":
        String t="";
        for(int a=0;a<l-1;a++)
        {
            for(int j=0;j<l-1;j++)
            {
                if(store[a].compareTo(store[j+1])>0)
                {
                    t=store[a];
                    store[a]=store[j+1];
                    store[j+1]=store[a];
                }
            }
        }
        break;
        case "selection":
        String m="";int w=0;
        for(int a=0;a<l-1;a++)
        {
            m=store[a];
            w=a;
            for(int j=a+1;j<l;j++)
            {
                if(m.compareTo(store[j])>0)
                {
                    m=store[j];
                    w=j;
                }
                
                store[w]=store[a];
                store[a]=m;
            }
        }
        break;
    }
    for(int r=0;r<l;r++)
    System.out.print(store[r]+",");
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
       
        
        