////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : OnBit
//  Description    : Turns ON the first 4 bits of the given integer to 1 and returns the modified value
//  Input          : Integer 
//  Output         : Integer
//  Author         : Sakshi Ravindra Darandale
//  Date           : 06/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    long OnBit(long iNo)
    {
        long iMask = 0X1, iResult = 0;

        iMask = (iMask << 4)-1;

        iResult = iNo | iMask;

        return iResult;
    
    }
}
class program65_5
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

        iRet = lobj.OnBit(iValue);

        System.out.println("The modified number is : " +iRet);

    
    }
    
}