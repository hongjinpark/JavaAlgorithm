package chap01;

public class Question12 {

    public static void main(String[] args) {
        int num = 1;

        do {
            System.out.print("  |");
            for(int z=1; z<=9; z++) {
                System.out.printf("%3d",z);
            }
            System.out.println();
            System.out.println("---+---------------------------");

            for(int i=1; i<=9; i++) {
                System.out.printf(i + " |");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%3d", i * j);
                }
                System.out.println();
                num++;
            }
        }while(num>10);
    }
}


