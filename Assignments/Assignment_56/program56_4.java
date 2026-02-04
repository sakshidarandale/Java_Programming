////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program56_4
//  Function Name  : main
//  Description    : Creates a new file if it does not already exist
//  Input          : File name
//  Output         : File creation status message
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program56_4
{

    public static void main(String A[])  throws Exception
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.createNewFile())
        {
            System.out.println("File gets created succesfully");
        }
        else
        {
            if(fobj.exists())
            {
                System.out.println("The file already exists");
            }
            
        }

        sobj.close();
    }
}