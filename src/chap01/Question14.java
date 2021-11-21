package chap01;

import java.util.Scanner;

public class Question14 {

    public static void main (String[] args) {

        int a;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        System.out.println("단 수 :");
        a = stdIn.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j= 1; j<= a; j++) {

                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
