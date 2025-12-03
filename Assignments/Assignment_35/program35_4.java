/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckVowel
//  Description:    It is used to check whether a string contains
//                  at least one vowel (a, e, i, o, u)
//  Input:          String str
//  Output:         BOOL (TRUE if vowel present, FALSE otherwise)
//  Author:         Sakshi Ravindra Darandale
//  Date:           27/11/2025
//
////////////////////////////////////////////////////////////////

class StringX

{
    public boolean CheckVowel(String str)
    {
        int iCnt = 0;
        boolean bflag=false;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt]== 'o') || (Arr[iCnt] == 'u'))
            {
                bflag=true;
                break;
            }  
        }
        return bflag;
    }
}

class program35_4
////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////
{
    public static void main(String A[])
    {
        boolean bRet=false;
        
        Scanner scanobj=new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        String sobj= scanobj.nextLine();
        
        StringX strobj = new StringX();
        
        bRet=strobj.CheckVowel(sobj);
        
        if(bRet==true)
        {
            System.out.println("Contains Vowel");
        }
        else
        {
            System.out.println("There is no Vowel");
        }
        
    } 
   
}   
    