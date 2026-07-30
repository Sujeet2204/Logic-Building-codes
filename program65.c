// iteration
#include<stdio.h>


int main()
{
    int iNo = 723614;
    int iDigit = 0;

    printf("________________________________\n");
    printf("Orignal value of iNo is :%d\n",iNo);

    while(iNo!=0)
    {   
        printf("________________________________\n");
        iDigit = iNo % 10;
        printf("iDigit is:%d\n",iDigit);
        iNo = iNo / 10;
        printf("iNo is :%d\n",iNo);
    }
   
    printf("________________________________\n");


    return 0;
}