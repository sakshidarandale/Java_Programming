////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : program62_5
//  Function Name  : main
//  Description    : Opens a file safely using FileInputStream and handles exceptions.
//  Input          : File name
//  Output         : Confirmation of file opening or error messages
//  Author         : Sakshi Ravindra Darandale
//  Date           : 3/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program62_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream fiobj = null;

        try
        {
            System.out.println("Enter the name of file :");
            String FileName = sobj.nextLine();

            File fobj = new File(FileName);

            if( ! fobj.exists())
            {
                throw new FileNotFoundException("File does not exist");
            }

            fiobj = new FileInputStream(fobj);

            System.out.println("File opened successfully");

            fiobj.close();
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File not found");
        }
        catch(SecurityException e)
        {
            System.out.println("Error: Permission denied");
        }
        catch(IOException e)
        {
            System.out.println("Error: File I/O problem");
        }
        catch(Exception e)
        {
            System.out.println("Unexpected error occurred");
        }
        finally
        {
            sobj.close();                     
        }
    }
}
