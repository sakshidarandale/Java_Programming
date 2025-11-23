/////////////////////////////////////////////////////////////////////
//
// Input / Output
// 
//  Input:
//  rows : 5
//  columns : 5
//
//  Output:
// 
//   a  b   c   d   e
//   1  2   3   4   5
//   a  b   c   d   e
//   1  2   3   4   5
//   a  b   c   d   e
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
        
        char ch='\0';

        for(i = 1; i <= iRow; i++) 
        {
            for(j = 1,ch='a'; j <= iCol; j++,ch++)
            {
                if((i%2)==0)
                {
                    System.out.printf("%d\t",j);
                }
                else
                {
                    System.out.printf("%c\t",ch);
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

class program29_3
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


