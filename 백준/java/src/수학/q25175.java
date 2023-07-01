package 수학;

import java.util.Scanner;

public class q25175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int[] q = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            q[i] = i - m + 3;
        }
        while (k < q[1]) {
            k += n;
        }
        while (k > q[n]) {
            k -= n;
        }
        for (int i = 1; i <= n; i++) {
            if (q[i] == k) {
                System.out.println(i);
                break;
            }
        }
    }
}
