/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  ReverseDisplay
//  Description:    It is used to display the given string in reverse
//                  order
//  Input:          String str
//  Output:         void 
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
////////////////////////////////////////////////////////////////

class StringX

{
    public void ReverseDisplay(String str)
    {
        int iCnt = 0;
        char Arr[]=str.toCharArray();
        
        for(iCnt=Arr.length-1;iCnt>=0;iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }
    }
}

class program35_5
////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();                  
        
        StringX strobj = new StringX();  
        
        strobj.ReverseDisplay(sobj);
    }
   
}   
    