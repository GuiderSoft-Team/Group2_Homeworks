import java.util.Scanner;

public class MaxMix {
    public static void main(String[] args) {

        int [] series = new int[10];
        Scanner input = new Scanner(System.in);

        int max;

        for (int i = 0; i <10; i++) {
            System.out.print((i+1)+".ci sayıyı giriniz:");
        series [i]=input.nextInt();
        }
        max=series[0];
        for (int i = 1; i < 10; i++) {
           if (series[i]>max) max=series[i];
        }

        System.out.print("max number oh the numbers listed="+max);



    }
}
