class Logic {
    void CalculatePower(int iBase, int iExp) {
        int iRes = 1;

        for (int i = 1; i <= iExp; i++) {
            iRes = iRes * iBase;
        }

        System.out.println(iBase + " raised to the power " + iExp + " is: " + iRes);
    }
}

class program19_5 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5); // 2^5 = 2x2x2x2x2 =32
    }
}
