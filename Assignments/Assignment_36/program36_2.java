/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  toUpperCaseX
//  Description:    It is used to convert all lowercase letters in
//                  a string to uppercasecase
//  Input:          String str
//  Output:         String (Updates string to lowercase)
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
    public String toUpperCaseX(String str)
    {
        int iCnt=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                Arr[iCnt]=(char)(Arr[iCnt] - 32);
            }                          
        }
 
       return new String(Arr);  
       
    }
}

class program36_2

////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////

{
    public static void main(String A[])
    {    
        String sRet=null;
        
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();
        
        StringX strobj = new StringX();  
        
        sRet=strobj.toUpperCaseX(sobj);  
        
        System.out.println("Updated String : " +sRet);
 
    }
}