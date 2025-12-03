/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////
//
//  Function Name:  Difference
//  Description:    It is used to calculate the difference between
//                  the number of small case and capital letters
//                  in a string
//  Input:          String str
//  Output:         int 
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
///////////////////////////////////////////////////////////////////


class StringX

{
    public int Difference(String str)
    {
        int iCnt = 0;
        int iDiff = 0, iSmall = 0, iCapital = 0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                iSmall++;
            }
            else if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                iCapital++;
            }
        }
        iDiff=iSmall-iCapital;
        
        return iDiff;
    }
}

class program35_3
////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////
{
    public static void main(String A[])
    {
        int iRet = 0;
        
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter the string : ");
        String sobj=scanobj.nextLine();
        
        StringX strobj=new StringX();
        
        iRet=strobj.Difference(sobj);
        
        System.out.println("Difference is : " +iRet);
       
    }
   
}   
    