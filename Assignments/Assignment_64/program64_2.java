////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name  : BoolCheckBit
//  Description    : Checks if the 5th & 18th bit of a given integer is ON Or OFF
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

        iMask = (iMask << 4) | (iMask << 17);

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
class program64_2
{
//////////////////////////////////////////////////////////////////////////////////////////
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
            System.out.println("5 th and 18 th bit is ON");
        }

        else 
        {
            System.out.println(" 5 th and 18 th bit is OFF");
        }
        
    }
    
}