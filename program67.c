// iteration
#include<stdio.h>

void DisplayDigits(int iNo)
{
    
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

}

int main()
{
    int iValue = 0;

    printf("enter number:\n");
    scanf("%d",&iValue);

    DisplayDigits(iValue);
    

    return 0;
}