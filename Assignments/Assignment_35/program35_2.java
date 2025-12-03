/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  CountSmall
//  Description:    It is used to count small letters in a string
//  Input:          String str
//  Output:         int 
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
////////////////////////////////////////////////////////////////

class StringX

{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program35_2
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
        
        iRet=strobj.CountSmall(sobj);
        
        System.out.println("Number of Small Letters in string are : " +iRet);
       
    }
   
}   
    