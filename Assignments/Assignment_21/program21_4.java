import java.util.*;

class Logic {

    void CountFactors(int iNo) {

        int i = 0;
        int iCount = 0;

        for (i = 1; i <= (iNo / 2); i++) {
            if (iNo % i == 0) {
                iCount++;
            }
        }
        System.out.println("Number of factors of " + iNo + " is: " + iCount);
    }
}

class program21_4 {
    public static void main(String A[]) {

        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}