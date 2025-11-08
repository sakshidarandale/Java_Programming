class Logic {
    void CheckPerfect(int iNo) {
        int i = 0;
        int iSum = 0;
        for (i = 1; i <= (iNo / 2); i++) {
            if (iNo % i == 0) {
                iSum = iSum + i;
            }
        }
        if (iSum == iNo) {
            System.out.println(iNo + " is a Perfect Number.");
        } else {
            System.out.println(iNo + " is not a Perfect Number.");
        }
    }
}

class program20_3 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}