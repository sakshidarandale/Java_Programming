////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : BoolCheckBit
//  Description    : Checks if the first(1) and last bit(32) is ON Or OFF.
//  Input          : Integer 
//  Output         : Boolean (true/false)
//  Author         : Sakshi Ravindra Darandale
//  Date           : 06/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    boolean BoolCheckBit(long iNo)
    {
        long iMask = 0X1, iResult = 0;

        iMask = (iMask << 0) | (iMask << 31);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }

        else
        {
            return false;
        }

    }
}
class program64_5
{

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
//////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) 
    {
    
        long iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        iValue = sobj.nextLong();

        Logic lobj = new Logic();

        bRet = lobj.BoolCheckBit(iValue);

        if(bRet == true)
        {
            System.out.println("first and last  bits is ON");
        }

        else 
        {
            System.out.println("first and last bits is OFF");
        }
        
    }
    
}