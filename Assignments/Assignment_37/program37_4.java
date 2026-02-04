/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Function Name:  LastChar
//  Description:    It is used to return the index of last
//                  occurrence of the entered character in the string.
//  Input:          String str,char ch
//  Output:         int
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
/////////////////////////////////////////////////////////////////////

class StringX
{
    public int LastChar(String str,char ch)
    {
        int iCnt=0;

        char Arr[]=str.toCharArray();
        
        for(iCnt=Arr.length-1;iCnt>=0;iCnt--)
        {
            if(Arr[iCnt]==ch)
            {
               return iCnt;
            }
        }
        return -1; 
    }  
}
class program37_4

////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////

{
    public static void main(String A[])
    {    
        char cValue='\0';
        int iRet=0;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();
        
        System.out.println("Enter the character : ");
        cValue=scanobj.next().charAt(0);
        
        StringX strobj = new StringX();  
        
        iRet=strobj.LastChar(sobj,cValue);  
        
        System.out.println("Index of character is : " +iRet);
        
        
    }
}