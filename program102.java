import java.util.*;              //proper code 

class ArrayX
{
    public void Display(int Brr[])
    {
        int i=0;
        System.out.println("Elements of the array are :");
        for(i=0;i<Brr.length;i++)
        {
            System.out.println(Brr[i]);
        }
    }
   
        public int Summation(int Brr[])
        {
            int i =0, iSum=0;

            for(i=0;i<Brr.length;i++)
            {
                iSum=iSum+Brr[i];
            }
            return iSum;
        }
}

class program102
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,i=0,iRet=0;
        System.out.println("Enter the size of array u want:");
        iSize =sobj.nextInt();

        int Arr[] = new int[iSize];        //dynamic
        
        System.out.println("Enter the elements:");

        for(i=0;i<Arr.length;i++)         //instead isize we use arr.length because it will alter
        {
            Arr[i] = sobj.nextInt();
        }
        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

       
        iRet= aobj.Summation(Arr);
        System.out.println("sum of even elements are"+iRet);
        //important memory free
        aobj = null;
        Arr=null;
        sobj=null;

        System.gc();          //request
        
    }

}