/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Function Name:  strrev
//  Description:    It is used to reverse (in place)the given string
//  Input:          String str
//  Output:         String
//  Author:         Sakshi Ravindra Darandale
//  Date:           30/11/2025
//
/////////////////////////////////////////////////////////////////////

class StringX
{
    public String strrev(String str)
    {
        int iCnt=0;

        char Arr[]=str.toCharArray();
        
        int iStart=0;
        int iEnd=Arr.length-1;
        char temp='\0';
        
        for(iStart=0,iEnd=Arr.length-1;iStart<iEnd;iStart++,iEnd--)
        {
            temp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=temp;
        }
        
        return new String(Arr);
      
    }

}
class program37_5

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
        
        sRet=strobj.strrev(sobj);  
        
        System.out.println("Reversed String is : " +sRet);
    }
}