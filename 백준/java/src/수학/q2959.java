package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q2959 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[4];
        for (int i = 0; i < 4; i++) {
            n[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(n);
        System.out.println(n[0] * n[2]);
    }
}
