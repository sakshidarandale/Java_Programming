///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  Display
//  Description:    It prints characters ASCII Value of a character 
//                  in decimal,octal and hexadecimal format         
//  Input:          char
//  Output:         void 
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
   void Display(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.print("Decimal format:%d\n",ch);
            System.out.print("Octal format:%#o\n",ch);
            System.out.print("Hexadecimal format:%#x\n",ch);
        
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
        
        Scanner scanobj=new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        cValue = scanobj.next().charAt(0);
        
        StringX strobj = new StringX();
        
        strobj.Display(cValue);
        
    }
}
    