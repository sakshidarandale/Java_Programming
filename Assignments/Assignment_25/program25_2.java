
import java.util.*;

class Logic
{
    public void  Display(int Arr[],int iLength)
    {
       int iCnt=0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt]%5==0)
            {
               System.out.println(Arr[iCnt]);
            }
        }
        
    }
}
class program25_2
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
        System.out.println("The numbers divisible by 5 are : ");
        lobj.Display(Arr,iSize);
        
        
        //Step 3:Free memory
        lobj=null;
        Arr=null;
        sobj=null;
        
        System.gc();
    }  
}      


    
    
   
