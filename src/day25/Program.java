package day25;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstName = "Ali";
        s1.lastName = "Desidero";
        s1.age = 26;
        s1.grades = new int[]{56, 82};

        s1.showInfo();


        Student s2 = new Student();
        s2.firstName = "Ayşe";
        s2.lastName = "Yılmaz";
        s2.age = 28;
        s2.grades = new int[]{24, 72};

        s2.showInfo();

        if (s1.getGPA() > s2.getGPA()) {
            s1.showInfo();
        } else if (s2.getGPA() > s1.getGPA()) {
            s2.showInfo();
        } else {
            System.out.println("Ortalamalar eşit");
        }

    }
}

