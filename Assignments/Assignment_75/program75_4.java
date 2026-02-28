
import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String HelmetWorn = null;
        String LicenseAvailable = null;
        String Overspeeding = null;

        int Amount = 0;

        System.out.println("Helmet Worn : (Yes/No)");
        HelmetWorn = sobj.next();

        System.out.println("License Available : (Yes/No)");
        LicenseAvailable = sobj.next();

        System.out.println("Overspeeding : (Yes/No)");
        Overspeeding= sobj.next();

        if((!HelmetWorn.equalsIgnoreCase("Yes")) && 
            (!HelmetWorn.equalsIgnoreCase("No"))
          )
        {
            System.out.println("Invalid Input");
            return;
        }

        if((!LicenseAvailable.equalsIgnoreCase("Yes")) && 
            (!LicenseAvailable.equalsIgnoreCase("No"))
          )
        {
            System.out.println("Invalid Input");
            return;
        }

        if((!Overspeeding.equalsIgnoreCase("Yes")) && 
            (!Overspeeding.equalsIgnoreCase("No"))
          )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(HelmetWorn.equalsIgnoreCase("No"))
        {
            Amount = Amount + 500;
        }

        if(LicenseAvailable.equalsIgnoreCase("No"))
        {
            Amount = Amount + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("Yes"))
        {
             Amount = Amount + 1500;
        }

        System.out.println("Total Fine Amount : " +Amount);

        sobj.close();
        
    }
}