/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  CountSpaces
//  Description:    It is used to count the number of space
//                  characters present in the given string
//  Input:          String str
//  Output:         void
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
    public int CountSpaces(String str)
    {
        int iCnt=0;
        int iCount=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]==' ')
            {
               iCount++;
            }
        } 
        return iCount;
    }
    
}
class program36_5

////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////

{
    public static void main(String A[])
    {    
        int iRet=0;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();
        
        StringX strobj = new StringX();  
        
        iRet=strobj.CountSpaces(sobj);  
        
        System.out.println("Number of whitespaces are : " +iRet);
        
    }
}