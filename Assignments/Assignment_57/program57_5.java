////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program57_5
//  Function Name  : main
//  Description    : Displays file names and sizes from a given directory
//  Input          : Directory name
//  Output         : File list with their sizes
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program57_5
{

    public static void main(String A[])  throws Exception
    {
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in directory are : " +fArr.length);

            for(int i = 0;i<fArr.length; i++)
            {
                System.out.println("File Name : " +fArr[i].getName());
                System.out.println("File Size : " +fArr[i].length());
            }

        }
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}