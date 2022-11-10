package day25;

public class Program {
    public static void main(String[] args) {
    Student s1=new Student();
    s1.firstName="Ahmet";
    s1.lastName="DURSUN";
    s1.age=47;
    s1.grades= new int[]{23, 45};

    s1.showInfo();

    Student s2=new Student();
    s2.firstName="Mehmet";
    s2.lastName="GELSİN";
    s2.age=32;
    s2.grades= new int[]{56, 67};

    s2.showInfo();

    if(s1.getGPA()>s2.getGPA()){
        s1.showInfo();
    } else if (s2.getGPA()>s1.getGPA()) {
        s2.showInfo();
    }else {
        System.out.println("Ortalamalar eşittir");
    }

    }
}
