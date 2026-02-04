////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.nio.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program62_4
//  Function Name  : main
//  Description    : Creates a backup copy of a source file .
//  Input          : Source file name
//  Output         : Backup file created in the same directory
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program62_4
{

    public static void main(String A[])  throws Exception
    {
        String SourceFile =  null;
        String BackupFile = null;
    
        byte Buffer[] = new byte[1024];
       
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file ");
        SourceFile = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        if(fobjsrc.exists()  && fobjsrc.isFile())
        {

            int index = SourceFile.lastIndexOf('.');

            if(index != -1)
            {
                BackupFile = SourceFile.substring(0,index) + "_backup" + SourceFile.substring(index);
            }

            else
            {
                BackupFile = SourceFile + "_backup";
            }

            File backupobj = new File(BackupFile);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(backupobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("Backup file created successfully" );

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