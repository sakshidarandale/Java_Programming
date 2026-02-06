////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : BoolCheckBit
//  Description    : Checks if the 7 th and 15 th and 21 st and 28 th bit of a given integer is ON Or OFF
//  Input          : Integer 
//  Output         : Boolean (true/false)
//  Author         : Sakshi Ravindra Darandale
//  Date           : 06/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    boolean BoolCheckBit(int iNo)
    {
        int iMask = 0X1, iResult = 0;

        iMask = (iMask << 6) | (iMask << 14) | (iMask << 20) | (iMask << 27);

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
class program64_3
{
/////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
//////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) 
    {
    
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.BoolCheckBit(iValue);

        if(bRet == true)
        {
            System.out.println("7 th and 15 th and 21 st and 28 th bit is ON");
        }

        else 
        {
            System.out.println("7 th and 15 th and 21 st and 28 th bit is OFF");
        }
        
    }
    
}