///////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  DisplaySchedule
//  Description:    It is used to display exam schedule based on division
//                  (A, B, C, or D)
//  Input:          char 
//  Output:         void
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
   void DisplaySchedule(char chDiv)
   {
    
        if(chDiv == 'A'|| chDiv=='a')
        {
            System.out.println("Exam is at 7:00 AM");
        }
        else if(chDiv == 'B' || chDiv == 'b')
        {
            System.out.println("Exam is at 8:30 AM");
        }
        else if(chDiv == 'C' || chDiv == 'c')
        {
            System.out.println("Exam is at 9:20 AM");
        }
        else if(chDiv == 'D' || chDiv == 'd')
        {
            System.out.println("Exam is at 10:30 AM");
        }
        else
        {
            System.out.println("Invalid Division");
        } 
    }
}
class program33_5
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
        
        strobj.DisplaySchedule(cValue);
        
    } 
}
    