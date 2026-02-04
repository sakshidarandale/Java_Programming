////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;


//////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program63_5
//  Function Name  : main
//  Description    : Copies first 1 KB data from source file into destination file
//  Input          : String (Source file name), String (Destination file name)
//  Output         : Copies first 1 KB data into destination file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
///////////////////////////////////////////////////////////////////////////////////////////////

class program63_5
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
            FileOutputStream foobj = new FileOutputStream(DestFile);

            iRet = fiobj.read(Buffer);

            if(iRet > 0)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("First 1KB data copied successfully");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();

    }
}