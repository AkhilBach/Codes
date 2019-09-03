#include<stdio.h>
#include<stdlib.h>
int Partition(int *a, int p, int r);
void QuickSort(int *a, int p, int r);
void Sort(int *a);
void DisplayArray(int *a);
void GetMaxMin(int *a, int temp);

void GetMaxMin(int *a, int temp)
{
  int i;
  temp = a[0];
    
}
int Partition(int *a, int p, int r)
{
  int x = a[r];
  int i = p - 1;
  int j,temp;
  for (j = p; j < r ; j++)
  {
    if(a[j] <= x)
    {
      i++;
      temp = a[j];
      a[j] = a[i];
      a[i] = temp;
    }
    temp = a[r];
    a[r] = a[i + 1];
    a[i + 1] = temp;
  }
  return ++i;
}

void QuickSort(int *a, int p, int r)
{
  int q = 0;
  if(p < r){
    q = Partition(a,p,r);
    QuickSort(a,p,q-1);
    QuickSort(a,q+1,r);
  }
}

void Sort(int *a)
{
  int p=0;
  int r= 9;
  QuickSort(a,p,r);
}

void DisplayArray(int *a)
{
  printf("The Array is:");
  int i;
  for (i = 0; i < 10 ; i++)
  {
    printf("%d\n",a[i]);
  }
}

int main()
{
  int a[10];
  int i,temp=0;
  for (i = 0; i < 10 ; i++)
  {
    a[i] = rand();
  }
  Sort(a);
  DisplayArray(a);
  GetMaxMin(a,temp);
  DisplayArray(a);
  return 0;
}
