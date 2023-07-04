package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q25849 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] money = new int[6][2];
        int[] t = { 1, 5, 10, 20, 50, 100 };
        for (int i = 0; i < 6; i++) {
            money[i][0] = scan.nextInt() * t[i];
            money[i][1] = t[i];
        }
        scan.close();
        Arrays.sort(money, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });
        System.out.println(money[0][1]);
    }
}
