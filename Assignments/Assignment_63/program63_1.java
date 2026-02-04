////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name   : program63_1
//  Description    : Accepts source and destination file names from user and
//                   copies data from source file to destination file .
//  Input          : String (Source file name), String (Destination file name)
//  Output         : Destination file containing copied data
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program63_1
{
    public static void main(String A[]) throws Exception
    {

        String SourceFile = null;
        String DestFile = null;

        byte Buffer[] = new byte[1024];
        int iRet =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        SourceFile = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        DestFile = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        if(fobjsrc.exists()  && fobjsrc.isFile())
        {
            File fobjdest = new File(DestFile);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            BufferedInputStream biobj = new BufferedInputStream(fiobj);

            FileOutputStream foobj = new FileOutputStream(DestFile);
            BufferedOutputStream boobj = new BufferedOutputStream(foobj);

            while((iRet = biobj.read(Buffer)) != -1)
            {
                boobj.write(Buffer,0,iRet);
            }

            System.out.println("File copied successfully");

            biobj.close();
            boobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();

    }

}
