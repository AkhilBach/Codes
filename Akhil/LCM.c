#include<stdio.h>
#include<stdlib.h>
int FindLCM(int a,int b,int c)
{
  int init,s,u;
  if(a>b && a>c)
  {
    init=a;
    s=b;
    u=c;
  }
  else
  {
    if (b>a && b>c) {
      init=b;
      s=a;
      u=c;
    }
    else
    {
      init=c;
      s=a;
      u=b;
    }
  }
  printf("%d\n",s);
  int LCM;
  int i,num;
  for (i = 1; i ; i++) {
    num=init*i;
    if ((num%s)==0 && ((num%u)==0)) {
      LCM=num;
      return LCM;
    }
    }
}

int main(int argc,char *argv[]) {
  int result=FindLCM(atoi(argv[1]),atoi(argv[2]),atoi(argv[3]));
  printf("The LCM is = %d\n",result);
  return 0;
}
