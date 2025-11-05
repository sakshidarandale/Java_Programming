
class Logic {
    void CheckPlindrome(int iNo) {

        int iDigit = 0;
        int iRev = 0;
        int iOriginalNo = iNo;

        // updator
        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        if (iRev == iOriginalNo) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }

    }
}

class program17_2 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CheckPlindrome(121);
    }

}
