package day16;

public class task3 {
    public static void main(String[] args) {

        //Task 3:0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
        // Java programını yazınız.(Sıfır ve yüz dahil)
      /*  System.out.println();
        for (int i = 0; i <= 100; i=i+10) {
            System.out.print(i+" ");
        }*/

        int n1=5;
        int n2=2;
        for (int i = 0; i <=100; i++) {
            if (i%(n1*n2)==0){
                System.out.println(i);
            } //İkinci yöntem

        }
    }
}
