////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program62_3
//  Function Name  : main
//  Description    : Copies last N bytes from a source file to a destination file
//  Input          : Source file name, number of bytes (N), destination file name
//  Output         : Last N bytes copied into destination file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program62_3
{

    public static void main(String A[])  throws Exception
    {
        String SourceFile =  null;
        String DestFile = null;
        int N = 0;
       
        byte Buffer[] = new byte[1024];
       
        int iRet = 0;

        int BytesCopied = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file ");
        SourceFile = sobj.nextLine();

        System.out.println("Enter the number of bytes to copy (N) : ");
        N = Integer.parseInt(sobj.nextLine());

        System.out.println("Enter the name of destination file ");
        DestFile = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        if(fobjsrc.exists()  && fobjsrc.isFile())
        {
            long FileSize = fobjsrc.length();
            long StartPos = FileSize - N;
            
            File fobjdest = new File(DestFile);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            if(N>FileSize)
            {
                N = (int)FileSize;
            }

            fiobj.skip(StartPos);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
                BytesCopied = BytesCopied + iRet;
            }

            System.out.println(" Last " + BytesCopied + " bytes copied successfully");

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