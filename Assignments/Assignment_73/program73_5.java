////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Matrix
//  Description     : Represents a 2D matrix and performs matrix operations
//  Author          : Sakshi Ravindra Darandale
//  Date            : 24/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
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

    public Matrix(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;
        Arr = new int[iRow][iCol];
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function Name  : Accept
    //  Description    : Accepts elements from user and stores them in matrix
    //  Input          : Integer values
    //  Output         : None
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void Accept()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the elements of matrix ");

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
    //  Function Name  : CheckSparse
    //  Description    : Checks whether the matrix is a Sparse Matrix or not
    //  Input          : None
    //  Output         : Boolean (true/false)
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public boolean CheckSparse()
    {
        int i = 0, j = 0;
        int zeroCount = 0;
        int nonzeroCount = 0;

        if(iRow != iCol)
        {
            return false;
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0 )
                {
                    zeroCount++;
                }
                else
                {
                    nonzeroCount++;
                }
            } 
        }

        if(zeroCount > nonzeroCount)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : program73_5
//  Description     : Entry point of program to check Sparse matrix
//  Author          : Sakshi Ravindra Darandale
//  Date            : 24/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class program73_5
{
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    //////////////////////////////////////////////////////////////////////////////////////////   

    public static void main(String A[])
    {
        boolean  bRet = false;

        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        bRet = mobj.CheckSparse();

        if(bRet == true)
        {
            System.out.println("Matrix is a Sparse matrix");
        }
        else
        {
            System.out.println("Matrix is not a Sparse matrix");
        }
    }
}