////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name   : program63_2
//  Description    : Copies the source file using normal streams and buffered streams
//                   separately and compares the time taken by both methods.
//  Input          : String (Source file name), String (Destination file name 1),
//                   String (Destination file name 2)
//  Output         : Two copied files and time comparison in milliseconds
//  Author         : Sakshi Ravindra Darandale
//  Date           : 03/02/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////

class program63_2
{
    public static void main(String A[]) throws Exception
    {

        String SourceFile = null;
        String DestFile1 = null;
        String DestFile2 = null;

        byte Buffer1[] = new byte[1024];
        int iRet =0;

        byte Buffer2[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        SourceFile = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        DestFile1 = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        DestFile2 = sobj.nextLine();

        File fobjsrc = new File(SourceFile);

        if(fobjsrc.exists()  && fobjsrc.isFile())
        {
        //////////////////////////Normal Streams///////////////////////////
          
           File fobjdest1 = new File(DestFile1);

           long StartTimeNormal = System.currentTimeMillis();

           FileInputStream fiobj1 = new FileInputStream(fobjsrc);
           FileOutputStream foobj1 = new FileOutputStream(fobjdest1);

           while((iRet = fiobj1.read(Buffer1)) != -1)
           {
                foobj1.write(Buffer1,0,iRet);
           }

           fiobj1.close();
           foobj1.close();

           long EndTimeNormal = System.currentTimeMillis();

           long durationNormal = EndTimeNormal - StartTimeNormal ;

        ///////////////////////Buffered Streams//////////////////////////////

            File fobjdest2 = new File(DestFile2);
            long StartTimeBuffered = System.currentTimeMillis();


            FileInputStream fiobj2 = new FileInputStream(fobjsrc);
            BufferedInputStream biobj = new BufferedInputStream(fiobj2);

            FileOutputStream foobj2 = new FileOutputStream(fobjdest2);
            BufferedOutputStream boobj = new BufferedOutputStream(foobj2);

            while((iRet = biobj.read(Buffer2)) != -1)
            {
                boobj.write(Buffer2,0,iRet);
            }

            System.out.println("File copied successfully");

            biobj.close();
            boobj.close();

            fiobj2.close();
            foobj2.close();


            long EndTimeBuffered = System.currentTimeMillis();

            long durationBuffered = EndTimeBuffered - StartTimeBuffered;


            System.out.println("Time required using Normal Streams   : " + durationNormal + " ms");

            System.out.println("Time required using Buffered Streams : " + durationBuffered + " ms");
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();

    }
}