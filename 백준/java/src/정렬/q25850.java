package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class q25850 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int[][] card = new int[p][9];
        for (int i = 0; i < p; i++) {
            int c = scan.nextInt();
            for (int j = 0; j < c; j++) {
                card[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 0; i < p; i++) {
            Arrays.sort(card[i]);
        }

        for (int i = 0; i < p; i++) {
            for (int j : card[i]) {
                System.out.println(j);
            }
        }
    }
}
