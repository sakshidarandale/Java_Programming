class Logic {
    void DisplayGrade(int iMarks) {
        if (iMarks >= 90) {
            System.out.println("Grade:O");
        } else if (iMarks >= 80) {
            System.out.println("Grade:A");
        } else if (iMarks >= 70) {
            System.out.println("Grade:B");
        } else if (iMarks >= 60) {
            System.out.println("Grade:C");
        } else if (iMarks >= 50) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Failed");
        }
    }
}

class program19_2 {
    public static void main(String A[]) {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}
