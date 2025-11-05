
class Logic {
    void CountDigits(int iNo) {
        int iCount = 0;
        int iDigit = 0;

        // updator
        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }
        System.out.println("The number of digits are : " + iCount);
    }
}

class program16_5 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CountDigits(7865);
    }

}
