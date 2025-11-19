import java.util.*;

class Logic
{
    public int Frequency(int Arr[],int iLength,int iNo)
    {
        int iCnt = 0, iFrequncy = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iFrequncy++;
            }
        }
        return iFrequncy;
    }
}

class program22_5
{
    public static void main(String A[])
    {
        int iCnt = 0,iSize = 0, iRet = 0,iValue=0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];


        System.out.println("Enter the number : " );
        iValue=sobj.nextInt();
        
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj=new Logic();
        
        
        iRet = lobj.Frequency(Arr,iSize,iValue);
        
        System.out.println("The frequncy of " +iValue+ " is : " +iRet);

        // Important
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}