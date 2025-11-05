
class Logic {
    void ReverseNumber(int iNo) {

        int iDigit = 0;
        int iRev = 0;

        // updator
        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        System.out.println("The reversed number is : " + iRev);

    }
}

class program16_4 {
    public static void main(String args[]) {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}