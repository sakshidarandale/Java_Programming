
import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        float Tax = 0;

        System.out.println("Enter the Annual Income :");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0;
        }

        else if(Income > 250000 && Income <= 500000 )
        {
            Tax =  (Income - 250000) * 0.05f;
        }

        else if(Income > 500000 && Income <= 1000000 )
        {
            Tax = (250000 * 0.05f) + (Income - 500000) * 0.2f;
        }

        else
        {
            Tax = (float)(250000 * 0.05f) + (500000 * 0.2f) + (Income - 1000000) * 0.3f;
        }

        System.out.println("Annual Income : " +"Rs." +Income);
        System.out.println("Total Tax Payable : " +"Rs." +Tax);


        sobj.close();
        
    }
}