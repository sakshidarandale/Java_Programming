import java.util.*;

class Logic
{
    int LastOcc(int Arr[],int iLength,int iNo)
    {
        int iCnt=0;
        int iIndex=-1;
        
        for(iCnt=iLength-1;iCnt>=0;iCnt--)
        {
            if(Arr[iCnt]==iNo)
            {
                iIndex=iCnt;
                break;
            }  
        }
        return iIndex;
    }
}

class program23_3
{
    public static void main(String A[])
    {
        int iCnt=0,iRet=0,iSize=0,iValue=0;
        
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();
        
        //Step 1:Allocate the memory
        int Arr[]=new int[iSize];
        
        System.out.println("Enter the element to search : ");
        iValue=sobj.nextInt();
        
        System.out.println("Enter the elments : ");
        
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        
        //Step2:Use memory
        iRet=lobj.LastOcc(Arr,iSize,iValue);
        
        if(iRet==-1)
        {
            System.out.println("Number not found");
        }
        else
        {
            System.out.println("Last Occurrence of " +iValue+ " is " +iRet);   
        } 
        //Step3:Free memory 
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();  
    }
}