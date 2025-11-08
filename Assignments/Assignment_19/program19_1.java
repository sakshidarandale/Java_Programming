class Logic {
    void CheckLeapYear(int iYear) {
        if (iYear % 400 == 0) {
            System.out.println(iYear + " is a Leap Year");
        } else if (iYear % 100 == 0) {
            System.out.println(iYear + " is not a Leap Year");
        } else if (iYear % 4 == 0) {
            System.out.println(iYear + " is a Leap Year");
        } else {
            System.out.println(iYear + " is not a Leap Year");
        }

    }

}

class program19_1 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}
