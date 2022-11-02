package day16;

public class Task2 {
    public static void main(String[] args) {
//int tekToplam=0;
//int ciftToplam=0;
//        for (int i = 1; i <100; i++) {
//
//
//            if(i % 2 == 0){
//                ciftToplam+=i;
//
//            }else {
//                tekToplam+=i;
//
//            }
//
//            }
//        System.out.println("çift sayıların toplamı : "+ciftToplam);
//        System.out.println("Tek sayıların toplamı : "+tekToplam);
//
//        }
//

        System.out.println("Kilometre\t mil");

        for(int i = 60; i <= 130; i+=10) {
            double mil=i*0.6214;
            System.out.printf("%5d\t\t%5.2f",i,mil);
            System.out.println();

    }
 }
}

