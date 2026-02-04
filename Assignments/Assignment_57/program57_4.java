////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;
import java.security.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program57_4
//  Function Name  : main
//  Description    : Displays file contents and generates SHA-256 checksum
//  Input          : File name
//  Output         : File data and checksum value
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program57_4
{

    public static void main(String A[])  throws Exception
    {
        int iRet = 0;

        String FileName = null;
        byte Buffer[] = new byte[1024]; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        
        if(fobj.exists())
        {
            String str = null;

            FileInputStream fiobj = new FileInputStream(fobj);

            MessageDigest mdobj = MessageDigest.getInstance("SHA-256");

            while((iRet = fiobj.read(Buffer))  != -1)
            {
                mdobj.update(Buffer,0,iRet);
                str = new String(Buffer,0,iRet);
                System.out.println(str);
                str = null;
            }

            byte [] hashBytes = mdobj.digest();

            StringBuilder checksum = new StringBuilder();

            for(int i = 0; i < hashBytes.length; i++)
            {
                checksum.append(String.format("%02x",hashBytes[i]));
            }

            System.out.println("Checksum : " +checksum.toString());

            fiobj.close();

        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}