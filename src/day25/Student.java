package day25;

public class Student {
    public String firstName, lastName;
    public int age;
    public int[] grades;


    public void showInfo() {
        System.out.printf("%s %s [%d] [%5.2f] \n", firstName, lastName, age, getGPA());
    }

    public double getGPA() {
        int toplam = 0;
        double ortalama = 0;
        for (int i = 0; i < grades.length; i++) {
            toplam += grades[i];
            ortalama = (double) toplam / 2;
        }
        return ortalama;
    }

}
