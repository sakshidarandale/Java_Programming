
class Logic {
    void SumOfDigits(int iNo) {

        int iDigit = 0;
        int iSum = 0;

        // updator
        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {

            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;

        }
        System.out.println("The number sum of digits is : " + iSum);
    }
}

class program17_1 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }

}
