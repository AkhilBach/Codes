class order
{
  static  int a[]={5,3,8,4,9,2,1,12,98,16};
    public static void main(String args[])
    {
        bubblesort();
       // selectsort();
    }
    static void bubblesort()
    {
        int l=a.length-1;
        int t=0;
       for(int b=0;b<l;b++)
       {
           for(int c=0;c<l;c++)
           {
               if(a[c]>a[c+1])
               {
                   t=a[c];
                   a[c]=a[c+1];
                   a[c+1]=t;
                }
            }
        }
        System.out.println("Bubble Sort:");
        for(int s=0;s<10;s++)
        System.out.print(" "+a[s]);
        
    }
}
        