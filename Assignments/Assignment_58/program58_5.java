////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program58_5
//  Function Name  : main
//  Description    : Packs all files from a directory into a single file
//                   by storing file name, file size, and file data
//  Input          : Directory name, Output file name
//  Output         : One packed file containing multiple files
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program58_5
{

    public static void main(String A[])  throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        String DirectoryName = sobj.nextLine();

        System.out.println("Enter the name of file");
        String PackName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File packobj = new File(PackName);

            packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packobj);

            FileInputStream fiobj = null;

            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the directory are : " +fArr.length);

            for(int i = 0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println("File name : " +fArr[i].getName() + " File size : " +fArr[i].length() + "bytes");

                foobj.write((fArr[i].getName() + "\n").getBytes());

                foobj.write((fArr[i].length() + "\n").getBytes());

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0 ,iRet);
                }

                foobj.write("\n".getBytes());

                fiobj.close();
            }

            System.out.println("Data gets copied successfully");
           
            foobj.close();
        }
        
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}