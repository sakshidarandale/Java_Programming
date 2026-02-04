////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program57_3
//  Function Name  : main
//  Description    : Creates a new directory if it does not already exist
//  Input          : Directory name
//  Output         : Directory creation status message
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program57_3
{

    public static void main(String A[])  throws Exception
    {
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if(fobj.mkdirs())
        {
            System.out.println("Directory created successfully");

        }
        else
        {
            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory already present");
            }
        }

        sobj.close();
    }
}