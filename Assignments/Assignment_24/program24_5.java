
import java.util.*;

class Logic
{
    void DigitsSum(int Arr[],int iLength)
    {
       int iCnt=0,iSum=0,iNum=0,iDigit=0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            iNum=Arr[iCnt];
            
            iSum=0;
            
           while(iNum!=0)
           {
            iDigit=iNum%10;
            iSum=iSum+iDigit;
            iNum=iNum/10;
           } 
           System.out.println("The sum of Digits of " +Arr[iCnt]+" is : " +iSum);
        }
    }
}
class program24_5
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


    
    
   
