package day25;

public class Student {
    public String firstName, lastName;
    public int age;
    public int[] grades;

    public void showInfo(){
        System.out.printf("%s %s [%d] %5.2f\n",firstName,lastName,age,getGPA());
    }

    public double getGPA() {
        double avg=0;
        int sumGrades=0;
        for (int i = 0; i < grades.length; i++) {
            sumGrades+=grades[i];
            avg = (double)sumGrades/2;
        }
        return avg;
    }
}
