package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q15969 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        Arrays.sort(h);
        System.out.println(h[n - 1] - h[0]);
        scan.close();
    }
}
