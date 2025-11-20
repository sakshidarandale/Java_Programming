import java.util.*;

class Logic
{
    int Minimum(int Arr[],int iLength)
    {
        int iCnt=0,iMin=0;
        
        for(iMin=Arr[iCnt],iCnt=0;iCnt<iLength;iCnt++)
        {
            if(Arr[iCnt]<iMin)
            {
                iMin=Arr[iCnt];
            }
        }
        return iMin;
    }

}
class program24_2
{
    public static void main(String A[]) 
    {
        int iCnt=0,iSize=0,iRet=0;
    
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();
        
        //Step 1:Allocate the memory
        int Arr[]= new int [iSize];
        
        System.out.println("Enter the elements : ");
        
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        
        //Step 2:Use the memory
        iRet= lobj.Minimum(Arr,iSize);
        
        System.out.println("Minimum number is : " +iRet);
        
        //Step 3:Free memory
        lobj=null;
        Arr=null;
        sobj=null;
        
        System.gc();
    }
    
}      


    
    
   
