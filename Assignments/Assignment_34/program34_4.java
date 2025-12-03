///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  Display
//  Description:    It prints checks whether a character is special
//                  or not(@,%<#)        
//  Input:          char
//  Output:         BOOL(True/False)
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
/////////////////////////////////////////////////////////////////////

class StringX
{
   public boolean CheckSpecial(char ch)
    {
        
    if((ch>='A'&&ch<='Z') ||(ch>='a'&&ch<='z'))
    {
        return false;
    }
    else
    {
        return true;
    }  
} 

}   

class program34_4
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
    
    bRet=strobj.CheckSpecial(cValue);
    
    if(bRet==true)
    {
        System.out.println("It is a Special Character");
    }
    else
    {
        System.out.println("It is not a Special Character");
    }
    
    } 
}
    