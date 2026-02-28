
import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter the Marks :");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendance :");
        Attendance = sobj.nextInt();
        
        System.out.println("Enter the Income :");
        Income = sobj.nextInt();

        if((Marks < 0 || Marks > 100) 
            || (Attendance < 0 || Attendance > 100) 
            || (Income < 0)
          )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks are less than 80%");
            return;
        }

        if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance are less than 75%");
            return;
        }

        if(Income > 300000)
        {
            System.out.println("Scholarship Rejected :Family Income is more than Rs.300000");
            return;
        }
       
        System.out.println("Scholarship Approved");

        sobj.close();
        
    }
}