////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program56_3
//  Function Name  : main
//  Description    : Appends text at the end of an existing file
//  Input          : File name
//  Output         : Text appended to file
//  Author         : Sakshi Ravindra Darandale
//  Date           : 02/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program56_3
{

    public static void main(String A[])  throws Exception
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        
        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj,true);
            String str = "Marvellous Infosystems...";

            byte Arr[] = str.getBytes();

            foobj.write(Arr);

            foobj.close();

        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}