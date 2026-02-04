////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program62_2
//  Function Name  : main
//  Description    : Copies first N bytes from a source file to a destination file
//  Input          : Source file name, number of bytes (N), destination file name
//  Output         : First N bytes copied into destination file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program62_2
{

    public static void main(String A[])  throws Exception
    {
        String SourceFile =  null;
        String DestFile = null;
        int N = 0;

        byte Buffer[] = new byte[1024];
       
        int iRet = 0;

        int BytesCopied = 0;
        int BytestoWrite = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file ");
        SourceFile = sobj.nextLine();

        System.out.println("Enter the number of bytes to copy (N) : ");
        N = sobj.nextInt();

        sobj.nextLine();        //OR  N = Integer.parseInt(sobj.nextLine));

        System.out.println("Enter the name of destination file ");
        DestFile = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        if(fobjsrc.exists()  && fobjsrc.isFile())
        {
            File fobjdest = new File(DestFile);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);
           
            while((iRet = fiobj.read(Buffer)) != -1 && BytesCopied < N)
            {
                BytestoWrite = iRet;

                if(BytesCopied + iRet > N)
                {
                    BytestoWrite = N - BytesCopied;
                }

                foobj.write(Buffer,0,BytestoWrite);

                BytesCopied = BytesCopied + BytestoWrite;
            }

            System.out.println(" First " + BytesCopied + " bytes copied successfully");

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