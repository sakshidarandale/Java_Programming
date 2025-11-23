/////////////////////////////////////////////////////////////////////
//
// Input / Output
// 
//  Input:
//  rows : 4
//  columns : 5
//
//  Output:
// 
//   2  4   6   8   10
//   1  3   5   7   9
//   2  4   6   8   10
//   1  3   5   7   9
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
//  Date           : 21/11/2025
//  
/////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++) 
        {
            int iCnt=0;
            if(i%2!=0)
            {
                iCnt=2;
            }
            else
            {
                iCnt=1;
            }
            
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt=iCnt+2;
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

class program29_2
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

