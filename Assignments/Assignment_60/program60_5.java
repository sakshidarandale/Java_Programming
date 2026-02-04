////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
import java.nio.file.Path;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program60_5
//  Function Name  : main
//  Description    : Checks if a given path exists and identifies it as a file or directory
//  Input          : Path name (file or directory)
//  Output         : Message indicating existence and type of the path
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program60_3
{
    public static void main(String A[]) throws Exception
    {

        boolean bFlag = false;

        File fobj = null;
        String PathName= null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Path");
        PathName= sobj.nextLine();

        fobj = new File(PathName);

        if((fobj.exists()))
        {
            System.out.println("Path exists");

            if(fobj.isFile())
            {
                System.out.println("It is a file");
            }

            else if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }    
        }

        else
        {
            System.out.println("No such path exists");
        }

        sobj.close();

    }       
}