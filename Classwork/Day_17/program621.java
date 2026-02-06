import java.util.*;

class program620
{
    public static void main(String A[])
    {
        int iNo = 0 ;
        int iDigit = 0;
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo %2;
            iCount = iCount + iDigit;
            iNo = iNo/2; 
        }
        System.out.println("Number of 1's are : " +iCount);
    }
}