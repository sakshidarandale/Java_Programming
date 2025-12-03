///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckSmall
//  Description:    It is used to check whether the entered                 
//                  character is a small case alphabet or not
//  Input:          char
//  Output:         BOOL (TRUE/FALSE)
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
//////////////////////////////////////////////////////////////////////
class StringX
{
   public boolean CheckSmall(char ch)
    {
        
    if(ch>='a'&&ch<='z')
    {
        return true;
    }
    else
    {
        return false;
    }  
} 
}
class program33_4
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
        
        bRet=strobj.CheckSmall(cValue);
        
        if(bRet==true)
        {
            System.out.println("It is a Small Character");
        }
        else
        {
            System.out.println("It is not a Small Character");
        }
        
    } 
}
    