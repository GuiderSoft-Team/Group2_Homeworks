package day19;

public class Task {
    public static void main(String[] args) {
        //Store grades of twelve students in an integer array variable.
        // Write a Java program that finds the average of these grades.
        //        grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45
        //average?

        int [] grades = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];
        }
        System.out.printf("Avarage = %5.2f\n" , sum / grades.length);
    }
}