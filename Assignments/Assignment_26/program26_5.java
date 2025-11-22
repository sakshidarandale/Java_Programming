/////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
/////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////// 
//
//  Class Name     : Logic
//  Function Name  : Display
//  Description    : It is used to display numbers with * in between
//  Input          : integer
//  Output         : void
//  Author         : Sakshi Ravindra Darandale
//  Date           : 21/11/2025
//  
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iNo)
    {
    
        int iCnt=0;
        
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            {
                System.out.print((iCnt*2)+"\t");
            } 
        }
        System.out.println();
    }    
}
            

/////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////

class program26_5
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        
        int iValue=0;
        
        System.out.println("Enter the number of elements : ");
        iValue=sobj.nextInt();
        
        Logic lobj=new Logic();
        
        lobj.Display(iValue);
    }
}

////////////////////////////////////////////////////////////////////
//   
//  Input :8
//   
//  Output :
//   
//    2     4      6      8      10     12     14     16     18
//                         
//////////////////////////////////////////////////////////////////// 
