
class Logic {

    void SumEvenNumbers(int iNo) {

        int i = 0;
        int iSum = 0;

        for (i = 0; i <= iNo; i++) {
            if ((i % 2) == 0) {
                iSum = iSum + i;
            }
        }
        System.out.println("Summation of even numbers up to " + iNo + " is: " + iSum);
    }
}

class program20_1 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);

    }

}
