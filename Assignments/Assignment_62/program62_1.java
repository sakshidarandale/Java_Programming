////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program62_1
//  Function Name  : main
//  Description    : Reads a file and displays the total number of bytes
//  Input          : File name
//  Output         : Total number of bytes in the file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program62_1
{

    public static void main(String A[])  throws Exception
    {
        String FileName = null;
       
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            FileInputStream fiobj = new FileInputStream(fobj);
           
            byte Buffer[] = fiobj.readAllBytes();

            System.out.println("Total number of bytes read: " +Buffer.length);

            fiobj.close();  
        }

        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}