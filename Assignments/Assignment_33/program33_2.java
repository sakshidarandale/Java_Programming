///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckAlpha
//  Description:    It is used to check whether the entered character 
//                  is an alphabet (A-Z or a-z) or not
//  Input:          char
//  Output:         BOOL (TRUE / FALSE)
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
//////////////////////////////////////////////////////////////////////

class StringX
{
   public boolean CheckCapital(char ch)
    {
        
    if(ch>='A'&&ch<='Z')
    {
        return true;
    }
    else
    {
        return false;
    }  
} 
}
class program33_2
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
        
        bRet=strobj.CheckCapital(cValue);
        
        if(bRet==true)
        {
            System.out.println("It is a Capital Character");
        }
        else
        {
            System.out.println("It is not a Capital Character");
        }
        
    } 
}
    