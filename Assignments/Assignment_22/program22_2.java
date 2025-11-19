import java.util.*;

class Logic
{
    public int FrequencyDiff(int Arr[],int iLength)
    {
        int iCnt = 0,iAns=0,iEvenCount = 0,iOddCount=0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }
        
        iAns=iEvenCount-iOddCount;
        
        return iAns;
    }
}

class program22_2
{
    public static void main(String A[])
    {
        int iCnt = 0,iSize = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        
        iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        
        Logic lobj=new Logic();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.FrequencyDiff(Arr,iSize);
        System.out.println("The number of Even elements are : " +iRet);

        // Important
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }   
}
