/////////////////////////////////////////////////////////////////////
//
// Input / Output
// 
//  Input:
//  rows : 4
//  columns : 4
//
//  Output:
// 
// *  *   *   #
// *  *   #   @
// *  #   @   @
// #  @   @   @
//
/////////////////////////////////////////////////////////////////////


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
//  Date           : 22/11/2025
//  
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        //updator
        
        if(iRow!=iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and Column number should be same");
            return;
        }
        for(i = 1; i <= iRow; i++) 
        {
            for(j = 1;j<=iCol; j++)
            {
                if(j==iCol-i+1)
                {
                    System.out.print("#\t");
                }
                else if(j<iCol-i+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("@\t");
                }
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

class program32_2
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

