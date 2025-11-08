class Logic {
    void CheckDivisible(int iNo) {
        if ((iNo % 5 == 0) && (iNo % 11 == 0)) {
            System.out.println(iNo + " is Divisble by 5 and 11");
        } else {
            System.out.println(iNo + " is not Divisble by 5 and 11");
        }
    }
}

class program19_3 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}