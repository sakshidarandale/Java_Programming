import java.util.*;

class Logic
{

    public boolean Check(int Arr[],int iLength)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iCount++;
                break;
            }
        }
        if(iCount>0)
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
}

class program22_3
{
    public static void main(String A[])
    {
        int iCnt = 0,iSize = 0;
        boolean bRet=false;
        
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

        bRet=lobj.Check(Arr,iSize);
        
        if(bRet==true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }
        // Important
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}