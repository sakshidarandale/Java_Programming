
import java.util.*;

class Logic
{
    void DigitsSum(int Arr[],int iLength)
    {
       int iCnt=0,iSum=0,iNum=0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iNum=Arr[iCnt];
            iSum=0;
           while(iSum!=0)
           {
           
            iSum=iSum+(iNum%10);
            iNum=iNum/10;
           } 
    
        }
    }
}
class program24_4
{
    public static void main(String A[]) 
    {
        int iCnt=0,iSize=0;
    
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
        lobj.DigitsSum(Arr,iSize);
    
        
        //Step 3:Free memory
        lobj=null;
        Arr=null;
        sobj=null;
        
        System.gc();
    }  
}      


    
    
   
