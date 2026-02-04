////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program63_4
//  Function Name  : main
//  Description    : Accepts directory name from user and creates a file
//                   named Combined.txt which stores data of all regular
//                   files from the directory sequentially.
//  Input          : String (Directory name)
//  Output         : One combined file containing data of all files
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
//////////////////////////////////////////////////////////////////////////////////
class program63_1
{

    public static void main(String A[]) throws Exception
    {

        File fobj = null; 
        String DirectoryName= null;

        byte Buffer[] = new byte[1024];
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory");
        DirectoryName = sobj.nextLine();

        fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
        
            File fArr[] = fobj.listFiles();

            FileOutputStream foobj = new FileOutputStream("Combined.txt");

            for(int i =0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())  //Only Regular Files
                {
                    FileInputStream fiobj = new FileInputStream(fArr[i]);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                }
               
            }
            foobj.close();

            System.out.println("All files combined successfully");
        }

        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
             
    }


}
