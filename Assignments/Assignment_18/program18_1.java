class Logic {
    void checkPrime(int iNo) {
        int iCnt = 0;
        int iFrequency = 0;

        // Updator
        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 2; iCnt <= iNo / 2; iCnt++) {
            if (iNo % iCnt == 0) {
                iFrequency++;
            }
        }

        if (iFrequency == 0) { // No factors found
            System.out.println(iNo + " is a prime number");
        } else { // At least one factor found
            System.out.println(iNo + " is not a prime number");
        }
    }
}

class program18_1 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
