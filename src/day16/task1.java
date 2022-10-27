package day16;

public class task1 {
    public static void main(String[] args) {

        //Task 1:0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)
        /*for (int i = 0; i <= 20; i=i+2) {
            System.out.print(i+  "  ");
        }*/ //1. yöntem

        //Complexity

        final int MAX=20; //----> 20'den sonra tire gelmesin diye bu yolla yaptık.
        for (int i = 0; i <= MAX; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i<MAX) {
                    System.out.print("-");
                    //2. yöntem
                }
                }
        }

    }
}
