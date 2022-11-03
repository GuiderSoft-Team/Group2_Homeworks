package day21;

public class Homework3 {
    public static void main(String[] args) {
        String[] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji","Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        System.out.println("Name\tDepartment");
        for (int i = 0; i < data.length; i+=2) {
            System.out.println(data[i]+"\t"+data[i+1]);


            }



        }
    }

