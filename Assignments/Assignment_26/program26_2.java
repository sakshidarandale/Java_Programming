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
//  Description    : It is used to display numbers in reverse 
//                   order with # in between
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
        int iCount=0;
            
        for(iCount=iNo;iCount>=1; iCount--)
        {
            System.out.print(iCount+"\t");
        
            System.out.print("#\t");
        }
        System.out.println();      
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////

class program26_2
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
///////////////////////////////////////////////////////////////
//   
//  Input :5
//   
//  Output :
//   
//          5   #   4   #   3   #   2   #   1   #
//                         
////////////////////////////////////////////////////////////// 
