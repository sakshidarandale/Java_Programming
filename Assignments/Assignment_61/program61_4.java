////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program61_4
//  Function Name  : main
//  Description    : Merges contents of two source files into a destination file
//  Input          : Two source file names, destination file name
//  Output         : Destination file containing merged content
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program61_4
{

    public static void main(String A[])  throws Exception
    {
        String FileName1 = null;
        String FileName2 = null;
        String DestFile = null;

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of first source file ");
        FileName1 = sobj.nextLine();

        File fobj2 = new File(FileName1);

        System.out.println("Enter the name of second source file ");
        FileName2 = sobj.nextLine();

        File fobj1 = new File(FileName2);

        System.out.println("Enter the name of destination file ");
        DestFile = sobj.nextLine();
        
        if(fobj1.exists() || fobj2.exists() )
        {
            File fobjdest = new File(DestFile);

            fobjdest.createNewFile();

            FileInputStream fiobj1 = new FileInputStream(fobj1);
            FileInputStream fiobj2= new FileInputStream(fobj2);

            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj1.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            while((iRet = fiobj2.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
            
            System.out.println("Files merged successfully");

            fiobj1.close();
            fiobj2.close();
            foobj.close();  

        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}