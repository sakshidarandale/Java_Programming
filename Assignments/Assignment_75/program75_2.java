
import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;
        String UnPaidLoan = null;

        System.out.println("Enter the Age :");
        Age = sobj.nextInt();

        System.out.println("Enter the Monthly Income :");
        MonthlyIncome = sobj.nextInt();

         System.out.println("Enter the Credit Score :");
        CreditScore = sobj.nextInt();

        System.out.println("DO you have any existing unpaid loan?(Yes/No)");
        UnPaidLoan = sobj.next();

        if(Age < 0 || MonthlyIncome < 0 || CreditScore < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if((UnPaidLoan.equalsIgnoreCase("Yes") == false) &&
            (UnPaidLoan.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input : Enter Yes or No");
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Your Age is not eligible ");
             return;
        }
        else if(MonthlyIncome < 25000)
        {
            System.out.println("Loan Rejected : Monthly Income is less than Rs.25000");
             return;
        }

        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : Credit Score is low");
             return;
        }

        else if(UnPaidLoan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : Existing unpaid loan");
            return;
        }

        System.out.println("Loan Approved");

        sobj.close();
        
    }
}