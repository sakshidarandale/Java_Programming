//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Matrix
//  Description     : Represents a 2D matrix and performs matrix operations.
//  Author          : Sakshi Ravindra Darandale
//  Date            : 24/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
    public int iNo;
    public int Arr[][];

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name  : Matrix (Constructor)
    //  Description    : Initializes matrix with given rows and columns
    //  Input          : Integer, Integer
    //  Output         : None
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
        Arr = new int[iRow][iCol];
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name  : Accept
    //  Description    : Accepts elements from user and stores them in matrix along with the number to count
    //  Input          : Integer values
    //  Output         : None
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Accept()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix");

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row : " + (i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name  : Display
    //  Description    : Displays the matrix elements
    //  Input          : None
    //  Output         : Prints matrix on console
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name  : CountNo
    //  Description    : Counts the frequency of the specified number in the matrix
    //  Input          : None
    //  Output         : Integer (frequency of the number)
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public int CountNo()
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : program72_2
//  Description     : Entry point of program to demonstrate counting frequency of a specific 
//                    number in a matrix
//  Author          : Sakshi Ravindra Darandale
//  Date            : 24/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class program72_2
{
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    //////////////////////////////////////////////////////////////////////////////////////////   

    public static void main(String A[])
    {
        int iRet = 0;
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.CountNo();

        System.out.println("Frequency of the element is : " + iRet);
    }
}