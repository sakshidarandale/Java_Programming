////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program59_5
//  Function Name  : main
//  Description    : Displays file names along with their absolute paths
//  Input          : Directory name
//  Output         : File names and their full paths
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program59_5
{
    public static void main(String A[]) throws Exception
    {

        File fobj = null;
        String DirectoryName= null;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        DirectoryName = sobj.nextLine();

        fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in directory are : " +fArr.length);

            for(int i =0; i<fArr.length; i++)
            {
               System.out.println("File Name : " +fArr[i].getName()  +  "  File Path : " +fArr[i].getAbsolutePath());
            } 
        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }

}