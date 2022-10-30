package day16;

public class Task1 {
    public static void main(String[] args) {
        /*
            Task 1:
            0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)
           
         */

/*        final int MAX=20;
        for (int i = 0; i <= MAX; i++) {
            if(i%2==0){
                System.out.print(i);
                if(i<MAX) {
                    System.out.print("-");
                }
            }
        }*/

        for (int i = 0; i <=20; i=i+2) {
            System.out.print(i+" ");
        }

        /*
            Complexity
         */



    }
}
