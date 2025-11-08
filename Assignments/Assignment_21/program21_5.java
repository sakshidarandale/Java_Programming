class Logic {

    void PrintDivisibleByTwoAndThree(int iNo) {
        int i = 0;

        System.out.println("Numbers divisible by both 2 and 3 from 1 to " + iNo + " are:");

        for (i = 1; i <= iNo; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}

class program21_5 {
    public static void main(String A[]) {

        Logic lobj = new Logic();
        lobj.PrintDivisibleByTwoAndThree(50); // Example: N = 50
    }
}
