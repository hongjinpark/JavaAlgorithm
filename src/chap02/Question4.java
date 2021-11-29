package chap02;

import java.util.Scanner;

public class Question4 {

    // 두 배열의 요소값이 모두 같은지 확인하기
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }

        return true;
    }

    // 배열 b의 모든 요소를 배열 a에 복사하기
    static int[] copy(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("배열 a,b의 길이는 같아야합니다.");
        }else{
            // b.length 3 0 1 2
            for(int i=0; i< b.length; i++){
                a[i] = b[i];
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 a의 길이:");
        int na = scanner.nextInt();
        int[] a = new int[na];



        System.out.println("배열 b의 길이:");
        int nb = scanner.nextInt();
        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 a,b의 길이가 같은가? " + equals(a, b));
        copy(a, b);
        System.out.println("배열 b요소를 a로 복사하기");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

    }
}
