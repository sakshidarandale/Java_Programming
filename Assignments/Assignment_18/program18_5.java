class Logic {
    void CheckSign(int iNo) {
        if (iNo == 0) {
            System.out.println("Number is Zero");

        } else if (iNo > 1) {
            System.out.println("Number is positive");

        } else {
            System.out.println("Number is negative");
        }

    }
}

class program18_5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }
}