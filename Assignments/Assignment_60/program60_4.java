////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program60_4
//  Function Name  : main
//  Description    : Displays all .txt files present in a directory
//  Input          : Directory name
//  Output         : Names of .txt files in the directory
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program60_4
{
    public static void main(String A[]) throws Exception
    {

        boolean bFlag = false;

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

            for(int i =0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    if(fArr[i].getName().endsWith(".txt"))
                    {
                        System.out.println("File Name : " + fArr[i].getName());
                        bFlag = true;
                    }
                }
            }
            if(bFlag == false)
            {
                System.out.println("There is  no such file ");
            } 
            
        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();

    }       
}