
class Logic {

    void EvenOddRange(int iNo) {
        int iCnt = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Loop from 1 to N
        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (iCnt % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of even numbers between 1 and " + iNo + " is: " + evenCount);
        System.out.println("Count of odd numbers between 1 and " + iNo + " is: " + oddCount);
    }
}

class program21_2 {
    public static void main(String A[]) {

        Logic lobj = new Logic();
        lobj.EvenOddRange(50);

    }
}
