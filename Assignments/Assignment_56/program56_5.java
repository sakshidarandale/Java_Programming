////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program56_5
//  Function Name  : main
//  Description    : Displays the list and count of files in a given directory
//  Input          : Directory name
//  Output         : File names and total count
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program56_5
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
            }

        }
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}