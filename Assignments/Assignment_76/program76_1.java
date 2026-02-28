
import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        float Amount = 0;
        String PeakHours = null;

        System.out.println("Enter the distance : ");
        Distance = sobj.nextInt();

        System.out.println("Peak Hours (Yes/No) :");
        PeakHours = sobj.next();

        if(!PeakHours.equalsIgnoreCase("Yes") &&
            !PeakHours.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Distance < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Distance <= 10)
        {
            Amount = 50 + (Distance * 12);
        }

        else
        {
            Amount = 50 + (10 * 12) + ((Distance - 10) * 15);
        }

        if(PeakHours.equalsIgnoreCase("Yes"))
        {
            Amount = Amount * (1 + 0.20f);
        }

        System.out.println("Distance :" +Distance +"km");
        System.out.println("Peak Hour : "+PeakHours);
        System.out.println("Total Fare :" +"Rs." +Amount);
        
        sobj.close();
        
    }
}