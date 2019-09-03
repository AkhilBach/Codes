class timemanagement
{
    private double hour,minute,second;
    timemanagement()
    {
    hour=0;
    minute=0;
    second=0;
}
private double convert(double hr,double min,double sec)
{
    double s=sec/60;
    double m=(min+s)/60;
    double h=hr+m;
    return h;
}
void method()
{
    timemanagement obj=new timemanagement();
    timemanagement ir=new timemanagement();
     System.out.println("The Time in hours:"+(obj.convert(123,54,38)+ir.convert(56,23,50)));
    
}
}
    