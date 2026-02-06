import java.util.*;

class program619
{
    public static void main(String A[])
    {
        int iNo = 0 ;
        int iDigit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo %2;
            System.out.print(iDigit);
            iNo = iNo/2; 
        }
    }
}