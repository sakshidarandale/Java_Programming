
import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int BudgetAmount = 0;
        int N = 0;
        int ItemPrice = 0;
        int Count = 0;
        int RemainingAmount = 0;

        System.out.println("Enter the Budget Amount :");
        BudgetAmount = sobj.nextInt();

        System.out.println("Enter the number of items :");
        N = sobj.nextInt();

        if(BudgetAmount < 0 || N < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        RemainingAmount = BudgetAmount;

        for(int i = 0 ; i < N; i++)
        {
            System.out.println("Enter price of item " + (i+1) + " :");
            ItemPrice = sobj.nextInt();
         
            if(ItemPrice <= 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(RemainingAmount >= ItemPrice)
            {
                RemainingAmount = RemainingAmount - ItemPrice;
                Count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased : " +Count);
        System.out.println("Remaining Balance : " +RemainingAmount);

        sobj.close();
        
    }
}