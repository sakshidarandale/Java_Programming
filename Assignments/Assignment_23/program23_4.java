import java.util.*;

class Logic
{
    void Range(int Arr[],int iLength,int iStart,int iEnd)
    {
        int iCnt=0;
        
        for(iCnt=0;iCnt<iLength;iCnt++)
        {
            if(Arr[iCnt]>=iStart && Arr[iCnt]<=iEnd)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
    
}

class program23_4
{
    public static void main(String A[])
    {
        int iCnt=0,iSize=0,iValue1=0,iValue2=0;
        
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();
        
        //Step 1:Allocate the memory
        int Arr[]=new int[iSize];
        
        System.out.println("Enter the starting point : ");
        iValue1=sobj.nextInt();
        
        System.out.println("Enter the ending point : ");
        iValue2=sobj.nextInt();
        
        System.out.println("Enter the elements : ");
            
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("The elements in the range are : ");

        Logic lobj = new Logic();
        
        //Step2:Use memory
        lobj.Range(Arr,iSize,iValue1,iValue2);
        
        //Step3:Free memory
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
    
    
}