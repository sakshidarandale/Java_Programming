///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  Display
//  Description:    It is used to converts the uppercase character 
//                  into lowercase and lowercase character to 
//                  uppercase and displays it
//  Input:          char* (Character array / string)
//  Output:         void (Updates string to lowercase)
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
   void Display(char ch)
   {
    if((ch>='a')&&(ch<='z'))
    {
        ch=(char)(ch-32);
    }
    else if((ch>='A')&&(ch<='Z'))
    {
        ch=(char)(ch+32);
    }
    
    System.out.println(ch); 
        
   }   
}
class program34_2
{
//////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
/////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        
        char cValue='\0';
       
        Scanner scanobj=new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        cValue = scanobj.next().charAt(0);
        
        StringX strobj = new StringX();
        
        strobj.Display(cValue);
        
    } 
}
    