////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program60_3
//  Function Name  : main
//  Description    : Finds the smallest file in a directory and displays its size
//  Input          : Directory name
//  Output         : Smallest file name and its size in bytes
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program60_3
{
    public static void main(String A[]) throws Exception
    {

        File fobj = null;
        String DirectoryName= null;

        long MinSize = Long.MAX_VALUE;
        File SmallestFile = null;
   
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
                    if(MinSize > fArr[i].length())
                    {
                        MinSize = fArr[i].length();
                        SmallestFile = fArr[i];
                    }
                }
            } 
            if(SmallestFile != null)
            {
                System.out.println("Smallest File Name : " + SmallestFile.getName() + " File Size : " +MinSize + " bytes ");
            }
            else
            {
                System.out.println("No files present in directory");
            }

        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }

}