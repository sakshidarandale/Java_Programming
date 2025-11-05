
class Logic {
    void CalculateSum(int iNo) {
        int iCnt = 0;
        int iSum = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iSum = iSum + iNo;
        }
        System.out.println("The sum of the first " + iNo + " natural numbers is: " + iSum);
    }
}

class program16_1 {
    public static void main(String args[]) {
        Logic lobj = new Logic();
        lobj.CalculateSum(10);
    }

}