///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckDigit
//  Description:    It is used to check whether the entered character
//                  is a digit or not
//  Input:          char
//  Output:         BOOL (TRUE/FALSE)
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
   public boolean CheckDigit(char ch)
    {
        
    if(ch>='0'&&ch<='9')
    {
        return true;
    }
    else
    {
        return false;
    }  
} 
}
class program33_3
{
//////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
/////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        
        char cValue='\0';
        boolean bRet=false;
        
        Scanner scanobj=new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        cValue = scanobj.next().charAt(0);
        
        StringX strobj = new StringX();
        
        bRet=strobj.CheckDigit(cValue);
        
        if(bRet==true)
        {
            System.out.println("It is a Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }
        
    } 
}
    