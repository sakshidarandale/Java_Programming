/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////
//
//  Function Name:  CountChar
//  Description:    It is used to count the frequency of the 
//                  entered character in the given string
//  Input:          String str,char ch
//  Output:         boolean(true/false)
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
////////////////////////////////////////////////////////////////

class StringX
{
    public int CountChar(String str,char ch)
    {
        int iCnt=0;
        int iCount=0;
        
        char Arr[]=str.toCharArray();
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]==ch)
            {
               iCount++;
            }
        } 
        return iCount;
    }
    
}
class program37_2

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
        
        iRet=strobj.CountChar(sobj,cValue);  
        
        System.out.println("Frequency of character is : " +iRet);
        
        
    }
}