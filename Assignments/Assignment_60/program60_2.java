////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program60_2
//  Function Name  : main
//  Description    : Finds the largest file in a directory and displays its size
//  Input          : Directory name
//  Output         : Largest file name and its size in bytes
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program60_2
{
    public static void main(String A[]) throws Exception
    {

        File fobj = null;
        String DirectoryName= null;

        long MaxSize = 0;
        File LargestFile = null;

        
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
                    if(MaxSize < fArr[i].length())
                    {
                        MaxSize = fArr[i].length();
                        LargestFile = fArr[i];
                    }
                }
            } 
            if(LargestFile != null)
            {
                System.out.println("Largest File Name : " + LargestFile.getName() + " File Size : " +MaxSize + "bytes");
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