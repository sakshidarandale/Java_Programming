
/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////// 
//
//  Class Name     : Logic
//  Function Name  : Check
//  Description    : It is used to check whether a specific number
//                   is present in the array or not
//  Input          : integer array, integer, integer
//  Output         : boolean
//  Author         : Sakshi Ravindra Darandale
//  Date           : 19/11/2025
//  
///////////////////////////////////////////////////////////////////
class Logic
{
    boolean Check(int Arr[],int iLength , int iNo)
    { 
        int iCnt=0;
        boolean bFlag=false;
        
        for(iCnt=0;iCnt<iLength;iCnt++)
        {
            if(Arr[iCnt]==iNo)
            {
                bFlag=true;
                break;    
            }
        }
        return bFlag;  
    }

}

/////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////

class program23_1
{
    public static void main(String A[])
    {
        int iCnt=0,iSize=0,iValue=0;
        boolean bRet=false;
        
        Scanner sobj=new Scanner(System.in);
        
    
        System.out.println("Enter the size of array : ");
        iSize = sobj.nextInt();
        
        //Step 1:Allocate the memory
        int Arr[]=new int[iSize];
        
        System.out.println("Enter the number to search : ");
        iValue=sobj.nextInt();
        
        System.out.println("Enter the elements : ");
        
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj=new Logic();
        
        //Step2:Use the memory
        bRet = lobj.Check(Arr,iSize,iValue);

        if(bRet==true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
        
        //Step3:Free memory
        lobj = null;
        Arr = null;
        sobj = null;
        
        System.gc();
    }
}



