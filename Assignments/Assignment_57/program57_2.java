
////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program57_2
//  Function Name  : main
//  Description    : Checks whether a given file is a regular file or not
//  Input          : File name
//  Output         : Displays file type status
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program57_2
{
    public static void main(String A[]) throws Exception
    {
        
        String FileName = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if((fobj.exists())&& (fobj.isFile()))
        {
            System.out.println("File is Regular File");
        }

        else
        {
            System.out.println("File is not a Regular File");
        }

        sobj.close();
       
    }

}