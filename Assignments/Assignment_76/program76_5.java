
import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int BatteryPercentage = 0;
        String Status = null;

        System.out.println("Enter the Battery Percentage : ");
        BatteryPercentage = sobj.nextInt();

        if(BatteryPercentage < 0 || BatteryPercentage > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(BatteryPercentage <= 5)
        {
            Status = "Critical";
        }
        else if(BatteryPercentage <= 15)
        {
            Status = "Low";
        }

        else 
        {
            Status = "Normal";
        }

        System.out.println("BatteryPercentage :" +BatteryPercentage +"%");
        System.out.println("Status :" +Status);

        sobj.close();
        
    }
}