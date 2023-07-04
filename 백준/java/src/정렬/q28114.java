package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class q28114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] p = new int[3][2];
        int[] q = new int[3];
        for (int i = 0; i < 3; i++) {
            p[i][0] = scan.nextInt();
            q[i] = scan.nextInt() % 100;
            p[i][1] = scan.next().charAt(0);
        }
        scan.close();
        Arrays.sort(q);
        for (int i = 0; i < 3; i++) {
            System.out.print(q[i]);
        }
        System.out.println();
        Arrays.sort(p, (a, b) -> {
            return b[0] - a[0];
        });
        for (int i = 0; i < 3; i++) {
            System.out.print((char) p[i][1]);
        }
    }
}
