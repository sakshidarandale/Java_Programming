////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : ToggleBit
//  Description    :  
//  Input          : Integer 
//  Output         : Integer
//  Author         : Sakshi Ravindra Darandale
//  Date           : 06/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    long ToggleBit(long iNo)
    {
        long iMask = 0X1, iResult = 0;
        long last = (iMask << 4)-1;
        long first = ((iMask << 4)-1) << 28;

        iMask = first | last;

        iResult = iNo ^ iMask;

        return iResult;
        
    }
}
class program66_5
{

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
//////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) 
    {
        long iValue = 0;
        long iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.ToggleBit(iValue);

        System.out.println("The modified number is : " +iRet);
    
    }
    
}