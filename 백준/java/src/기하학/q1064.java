package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] dot = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                dot[i][j] = scan.nextInt();
            }
        }
        Arrays.sort(dot, (a, b) -> {
            return a[0] - b[0];
        });
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dot[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
