package Exercicio3;

public class Student {
    public String name;
    public Double grade1;
    public Double grade2;
    public Double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String passOrNot() {
        if (finalGrade() >= 60) {
            return "PASS";
        } else {
            double passGrade = 60 - finalGrade();
            String s1 = "FAILED, MISSING" + passGrade;
            return s1;
        }
    }

}
