////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program59_3
//  Function Name  : main
//  Description    : Displays names of all sub-directories in the given directory
//  Input          : Directory name
//  Output         : List of sub-directories or message if none found
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program59_3
{

    public static void main(String A[]) throws Exception
    {

        boolean bRet = false;
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
                if(fArr[i].isDirectory() )  //sub-directories
                {
                    System.out.println("SubDirectory Name : " +fArr[i].getName());
                    bRet = true;
                }
            }
            if(bRet == false)
            {
                System.out.println("No subdirectories present");
            }
           
        }

        else
        {
            System.out.println("There is no such directory");
        }
            
        sobj.close();
    }

}