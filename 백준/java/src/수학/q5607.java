package 수학;

import java.util.Scanner;

public class q5607 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
        }
        scan.close();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > B[i]) {
                a += A[i] + B[i];
            } else if (A[i] < B[i]) {
                b += A[i] + B[i];
            } else {
                a += A[i];
                b += B[i];
            }
        }
        System.out.printf("%d %d\n", a, b);
    }
}
