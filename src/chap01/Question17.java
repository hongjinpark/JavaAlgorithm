package chap01;

import java.util.Scanner;

public class Question17 {

    private static void npira(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i-1) * 2+1; j++) {
                System.out.printf("%d",i%10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드 모양으로 나타냅니다.");
        do {
            System.out.print("단수는 ：");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.println("결과 :");
        npira(n);
    }
}
