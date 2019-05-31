#include <stdio.h>
#include <stdlib.h>
int main(int k, int *A[])
{
  s=sum(A);
  n=s/k;
  printf("Factorial of %d = %llu", n, factorial);
  return 0;
}

int sum(int *A[]){
  n=length(A);
  s=0;
  for(i=0;i<n;i++){
    s=s+A[i];
  }
  return s;
}
