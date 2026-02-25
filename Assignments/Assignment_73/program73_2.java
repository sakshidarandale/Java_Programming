///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////////////////////////////

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
    //  Function Name  : ReverseRow
    //  Description    : Reverses the elements in each row of the matrix
    //  Input          : None
    //  Output         : Updates matrix with rows reversed
    //  Author         : Sakshi Ravindra Darandale
    //  Date           : 24/02/2026
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void ReverseRow()
    {
        int i = 0;
        int iStart = 0;
        int iEnd = iCol - 1;

        for(i = 0; i < iRow; i++)
        {
            iStart = 0;       //reset iStart
            iEnd = iCol - 1;  //reset iEnd

           while(iStart < iEnd)
            {
                int temp = Arr[i][iStart];
                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = temp;

                iStart++;
                iEnd--;
            } 
        }

    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : program73_2
//  Description     : Entry point of program to demonstrate reversing rows of a matrix
//  Author          : Sakshi Ravindra Darandale
//  Date            : 24/02/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////

class program73_2
{
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    //////////////////////////////////////////////////////////////////////////////////////////   

    public static void main(String A[])
    {
        
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();

        System.out.println("Original Matrix : ");
        mobj.Display();

        mobj.ReverseRow();

        System.out.println("Reverse Row Matrix : ");
        mobj.Display();

    }
}