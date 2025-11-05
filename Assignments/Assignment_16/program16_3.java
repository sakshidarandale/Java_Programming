class Logic {
    void FindFactorial(int iNo) {
        int iCnt = 0;
        int iFact = 1;

        // updator

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iFact = iFact * iCnt;
        }

        System.out.println("Factorial is: " + iFact);

    }
}

public class program16_3 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);

    }
}
