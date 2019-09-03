#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct Node{
  char const *name;
  struct Node *next;
};

int main(int argc, char const *argv[]) {
  if(argc>0)
  {
    int i=0;
    struct Node *nodes[argc];
    struct Node *head=(struct Node *)malloc(sizeof(struct Node));
    head->name=argv[0];
    head->next=NULL;
    while(i<(argc-1))
    {
      nodes[i]=(struct Node *)malloc(sizeof(struct Node));
      nodes[i]->name=argv[i+1];
      head->next=nodes[i];
      nodes[i]->next=NULL;
      i++;
    }
    printf("%s \n",head->name);
    for (int i = 0; i < (argc-1); i++)
    {
      printf("%s \n",nodes[i]->name);
    }
  }
  else
  {
    perror("Arguments Incorrect.");
  }
  return 0;
}
