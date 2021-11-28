package chap02;

import java.util.Scanner;

public class Question3 {

    static void print(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    private static int sumOf(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.println("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        print(x);
        System.out.println("총 합: "+sumOf(x));
    }
}
