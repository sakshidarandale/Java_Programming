



////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : OnBit
//  Description    : Turns ON the bit at a given position.
//  Input          : Integer 
//  Output         : Integer
//  Author         : Sakshi Ravindra Darandale
//  Date           : 06/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    long OnBit(long iNo,int iPos)
    {
        long iMask = 0X1, iResult = 0;

        iMask = (iMask << iPos - 1);

        iResult = iNo | iMask;

        return iResult;
        
    }
}
class program66_3
{

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
//////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) 
    {
    
        long iValue = 0;
        int ipos = 0;
        long iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        System.out.println("Enter the position");
        ipos = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.OnBit(iValue,ipos);

        System.out.println("The modified number is : " +iRet);
    
    }
    
}