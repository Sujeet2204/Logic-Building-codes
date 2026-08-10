import java.util.*;              //proper code 

class ArrayX
{
    public void Display(int Brr[])
    {
        int i=0;
        for(i=0;i<Brr.length;i++)
        {
            System.out.println(Brr[i]);
        }
    }

}

class program100
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0;
        System.out.println("Enter the size of array u want:");
        iSize =sobj.nextInt();

        int Arr[] = new int[iSize];        //dynamic
       
        System.out.println("Enter the elements:");
        int i =0;

        for(i=0;i<Arr.length;i++)         //instead isize we use arr.length because it will alter
        {
            Arr[i] = sobj.nextInt();
        }
        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);
        
        //important memory free
        aobj = null;
        Arr=null;
        sobj=null;

        System.gc();          //request
        
    }

}