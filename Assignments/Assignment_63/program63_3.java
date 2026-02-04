////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program63_3
//  Function Name  : main
//  Description    : Copies all files from a source directory into a destination directory
//  Input          : Directory name (source), Directory name (destination)
//  Output         : Files copied into destination directory
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program63_3
{

    public static void main(String A[]) throws Exception
    {

        File dobjsrc = null;
        File dobjdest = null;
        String SourceDirName= null;
        String DestDirName = null;

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source directory");
        SourceDirName = sobj.nextLine();

        System.out.println("Enter the name of destination directory");
        DestDirName = sobj.nextLine();

        dobjsrc = new File(SourceDirName);
        dobjdest =  new File(DestDirName);

        if((dobjsrc.exists()) && (dobjsrc.isDirectory()))
        {
            if(!dobjdest.exists())
            {
                dobjdest.mkdir();
            }
        
            File fArr[] = dobjsrc.listFiles();

            for(int i =0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())  
                {

                    File destFile = new File(dobjdest,fArr[i].getName());

                    FileInputStream fiobj = new FileInputStream(fArr[i]);
                    FileOutputStream foobj = new FileOutputStream(destFile);


                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                    foobj.close();
                }
               
            }

            System.out.println("All files copied successfully");

        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }

}