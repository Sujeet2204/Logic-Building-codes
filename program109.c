#include<stdio.h>

int main()
{
    int Arr[]={10,20,30,40};

    printf("%d",Arr);
    printf("%d",&Arr);
    printf("%d",&(Arr[0]));

    printf("%lu",sizeof(Arr));

    return 0;
}