import java.util.*;

class program828
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        int iDigit = 0, iSum = 0, iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp / iSum == 0)
        {
            System.out.println(iTemp + " is a Harshad/Niven Number");
        }

        else
        {
            System.out.println(iTemp + " is not a Harshad/Niven Number");
        }

        
    }
}