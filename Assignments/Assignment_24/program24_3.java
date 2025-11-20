import java.util.*;

class Logic
{
    int Difference(int Arr[],int iLength)
    {
        int iCnt=0;
        int min = Arr[0];
        int max = Arr[0];

        for(iCnt = 1; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] < min)
            {
                min = Arr[iCnt];
            }
            if(Arr[iCnt] > max)
            {
                max = Arr[iCnt];
            }
        }
        return max - min;  
    }
}
class program24_3
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
        iRet= lobj.Difference(Arr,iSize);
        
        System.out.println("Diffrence between Max and Min number is : " +iRet);
        
        //Step 3:Free memory
        lobj=null;
        Arr=null;
        sobj=null;
        
        System.gc();
    }  
}      


    
    
   
