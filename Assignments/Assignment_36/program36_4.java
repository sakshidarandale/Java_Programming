/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  DisplayDigits
//  Description:    It is used to display only digits from string
//  Input:          String str
//  Output:         void
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
    public void DisplayDigits(String str)
    {
        int iCnt=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='0' && Arr[iCnt]<='9')
            {
               System.out.print(Arr[iCnt]);
            }
        } 
    }
}
class program36_4

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
        
        strobj.DisplayDigits(sobj);  
        
    }
}