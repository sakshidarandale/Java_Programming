import java.util.*;

class Logic
{
    public int Frequency(int Arr[],int iLength)
    {
        int iCnt = 0, iFrequncy = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iFrequncy++;
            }
        }
        return iFrequncy;
    }
}

class program22_4
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
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.Frequency(Arr,iSize);
        
        System.out.println("The frequncy of 11 is: " +iRet);

        // Important
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}