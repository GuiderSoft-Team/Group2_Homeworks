package day14;

public class Swap {
    public static void main(String[] args) {
        int a=8;
        int b=15;
        System.out.printf("a = %d\n",a);
        System.out.printf("b = %d\n",b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("a = %d\n",a);
        System.out.printf("b = %d\n",b);

    }
}
