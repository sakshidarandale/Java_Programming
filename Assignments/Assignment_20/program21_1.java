class Logic {
    void ProductOfDigits(int iNo) {

        int iDigit = 0;
        int iProduct = 1;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {

            iDigit = iNo % 10;

            iProduct = iProduct * iDigit;

            iNo = iNo / 10;
        }

        System.out.println("Product of digits is " + iProduct);

    }
}

class program21_1 {
    public static void main(String A[]) {

        Logic lobj = new Logic();
        lobj.ProductOfDigits(234);
    }

}
