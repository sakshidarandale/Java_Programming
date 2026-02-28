
import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int RequestedQuantity = 0;
        int RemainingStock = 0;

        System.out.println("Enter the Current Stock");
        CurrentStock= sobj.nextInt();

        System.out.println("Enter the Requested Quantity : ");
        RequestedQuantity = sobj.nextInt();

        if((CurrentStock < 0) || (RequestedQuantity < 0))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(RequestedQuantity > CurrentStock)
        {
            System.out.println("Order Failed : Insufficient Stock");
            return;
        }

        RemainingStock = CurrentStock - RequestedQuantity;

        System.out.println("Order Processed Successfully");
        System.out.println("Remaining Stock :" +RemainingStock);

        if(RemainingStock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        sobj.close();
        
    }
}