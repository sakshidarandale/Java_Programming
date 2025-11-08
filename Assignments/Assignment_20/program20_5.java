class Logic {

    void FindSmallestDigit(int iNo) {
        int iDigit = 0;
        int iMin = 9;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;

            if (iMin > iDigit) {
                iMin = iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("Smallest digit is: " + iMin);
    }
}

class program20_5 {
    public static void main(String a[]) {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(45872);
    }
}