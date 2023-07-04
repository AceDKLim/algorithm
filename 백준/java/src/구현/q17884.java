package 구현;

import java.util.Scanner;

public class q17884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() - 1;
        int[] r = new int[n + 1];
        r[0] = 1;
        for (int i = 0; i < n; i++) {
            r[scan.nextInt() + 1] = i + 2;
        }
        scan.close();
        for (int i : r) {
            System.out.print(i + " ");
        }
    }
}
