////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program59_4
//  Function Name  : main
//  Description    : Counts number of files and folders in the given directory
//  Input          : Directory name
//  Output         : Total files and total folders count
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program59_4
{

    public static void main(String A[]) throws Exception
    {

        File fobj = null;
        String DirectoryName= null;

        int FileCount = 0;
        int DirCount = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        DirectoryName = sobj.nextLine();

        fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            for(int i =0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    FileCount++;
                }
                else if(fArr[i].isDirectory())
                {
                    DirCount++;
                }
    
            }

            System.out.println("Number of files in directory is : " +FileCount);
            System.out.println("Number of folders in directory is : " +DirCount);
           
        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }

}