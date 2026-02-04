////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program56_2
//  Function Name  : main
//  Description    : Opens a file and displays its contents on the screen
//  Input          : File name
//  Output         : File data displayed on console
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program56_2
{
    public static void main(String A[]) throws Exception
    {
       int iRet = 0;

       boolean bRet = false;
       String FileName = null;
       byte Buffer[] = new byte[1024]; 

       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the name of file : ");
       FileName = sobj.nextLine();

       File fobj = new File(FileName);

       if(fobj.exists())
       {
            String str = null;

            FileInputStream fiobj= new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,0,iRet);
                System.out.print(str);
                str = null;
            } 
            System.out.println();

            fiobj.close();
        }

        else
        {
            System.out.println("There is no such file");
        }   
        
        sobj.close();

    }   
      
}
