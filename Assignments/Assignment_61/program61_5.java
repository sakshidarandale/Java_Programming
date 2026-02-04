////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program61_5
//  Function Name  : main
//  Description    : Splits a source file into two destination files
//  Input          : Source file name, two destination file names
//  Output         : Two files containing first and second halves of source file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program61_5
{

    public static void main(String A[])  throws Exception
    {
        String SourceFile = null;
        String DestFile2 = null;
        String DestFile1 = null;

        byte Buffer[] = new byte[1024];

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of first source file ");
        SourceFile = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        System.out.println("Enter the name of first destination file ");
        DestFile1 = sobj.nextLine();

        System.out.println("Enter the name of second destination file ");
        DestFile2 = sobj.nextLine();
        
        if(fobjsrc.exists())
        {
            File fobjdest1 = new File(DestFile1);

            fobjdest1.createNewFile();

            File fobjdest2 = new File(DestFile2);

            fobjdest2.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            
            FileOutputStream foobj1 = new FileOutputStream(fobjdest1);
            FileOutputStream foobj2  = new FileOutputStream(fobjdest2);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj1.write(Buffer,0,iRet/2);
                foobj2.write(Buffer,iRet/2,iRet-iRet/2);
            }

            System.out.println("Files splitted successfully");

            fiobj.close();
            foobj1.close();
            foobj2.close();  
        }

        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}