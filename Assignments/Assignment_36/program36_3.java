/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  strToggleX
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
    public String strToggleX(String str)
    {
        int iCnt=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                Arr[iCnt]=(char)(Arr[iCnt] + 32);
            }
            else if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                Arr[iCnt]=(char)(Arr[iCnt] - 32);
            }
        }
       return new String(Arr);  
    }
}
class program36_3

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
        
        sRet=strobj.strToggleX(sobj);  
        
        System.out.println("Updated String : " +sRet);
 
    }
}