
class Logic {
    void PrintTable(int iNo) {

        int iCnt = 0;
        int iMult = 0;

        System.out.println("The table of " + iNo + " is:");

        for (iCnt = 1; iCnt <= 10; iCnt++) {
            iMult = iCnt * iNo;
            System.out.println(iMult);
        }
    }
}

class program17_5 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}