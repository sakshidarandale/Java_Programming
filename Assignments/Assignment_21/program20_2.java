
class Logic {

    void PrintReverse(int iNo) {
        int i = 0;

        for (i = iNo; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class program20_2 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}
