package chap02;

import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = random.nextInt(10)+1;

        int[] height = new int[num];
        System.out.println("키 값은 아래와 같습니다.");
        for(int i = 0; i < num; i++){
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

    }

    private static int maxOf(int[] height) {
        int max = height[0];
        for(int i = 1; i < height.length; i++){
            if(max < height[i]) max = height[i];
        }
        return max;
    }
}
