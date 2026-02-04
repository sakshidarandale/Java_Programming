////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program59_2
//  Function Name  : main
//  Description    : Displays only regular file names from the given directory
//  Input          : Directory name
//  Output         : List of regular files in the directory
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program59_2
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
        
            File fArr[] = fobj.listFiles();

            for(int i =0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())  //Only Regular Files
                {
                    System.out.println("File Name : " +fArr[i].getName());
                }
               
            }
           
        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }

}