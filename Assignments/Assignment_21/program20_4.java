class Logic {

    void FindLargestDigit(int iNo) {
        int iDigit = 0;
        int iMax = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;

            if (iDigit > iMax) {
                iMax = iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("Largest digit is: " + iMax);
    }
}

class program20_4 {
    public static void main(String a[]) {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(83429);
    }
}