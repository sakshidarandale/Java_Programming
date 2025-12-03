///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////
//
//  Function Name:  Display
//  Description:    It prints characters from the given character up 
//                  to 'Z' if capital, or down to 'a' if small.               
//  Input:          char
//  Output:         void 
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
/////////////////////////////////////////////////////////////////////

class StringX
{
   void Display(char ch)
   {
    int iCnt='\0';
    if(ch >= 'A' && ch <= 'Z')
    {
        for(iCnt=ch;ch<='Z';ch++)
        {
            System.out.print( " "+ch);
            ch++;
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(iCnt=ch;ch>='a';ch--)
        {
            System.out.print(" "+ch);
            
        }
    }

}   
}
class program34_3
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
    