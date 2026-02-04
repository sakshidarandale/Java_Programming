////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program57_1
//  Function Name  : main
//  Description    : Copies data from a source file to a destination file
//  Input          : Source file name, Destination file name
//  Output         : New file created with copied data
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program57_1
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String str = null;

        File fobjsrc = null;
        File fobjdest = null;

        boolean bRet = false;

        String FileNameSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of source file : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copied successfully");

            fiobj.close();
            foobj.close();

        }

        else
        {
            System.out.println("There is no source file");
        }

        sobj.close();
          

       
    }

}