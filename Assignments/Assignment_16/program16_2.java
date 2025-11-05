
class Logic {
    void CheckEvenOdd(int iNo) {
        if ((iNo % 2) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}

class program16_2 {
    public static void main(String args[]) {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
    }
}