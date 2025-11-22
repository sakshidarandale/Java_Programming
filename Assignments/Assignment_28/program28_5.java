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
//  Description    : To display a Pattern 
//  Input          : integer,integer
//  Output         : void
//  Author         : Sakshi Ravindra Darandale
//  Date           : 21/11/2025
//  
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount=1;

        for(i = 1; i <= iRow; i++) 
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iCount+"\t");
                iCount++;
            }
            System.out.println();
        }
        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////

class program28_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue1, iValue2);
    }  
}

/////////////////////////////////////////////////////////////////////
//
// Input / Output
// 
//  Input:
//  rows : 3
//  columns : 4

//  Output:
//  1 2 3 4 
//  5 6 7 8
//  9 10 11 12
//   
/////////////////////////////////////////////////////////////////////


