import java.util.*;

class program827
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        int iCount = 0, iDigit = 0, iTemp = 0, iPow = 0, iSum = 0;

        iTemp = iNo;

        iCount = Integer.toString(iNo).length();  //inbuilt function
    
        //y = iCount -> 3
        //x = iDigit
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iPow = (int)Math.pow(iDigit , iCount);  //inbuilt function

            iSum = iSum + iPow;

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println(iTemp + " is a ArmStrong Number");
        }
        else
        {
            System.out.println(iTemp + " is not a ArmStrong Number");
        }
    }
}