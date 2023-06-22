package 기하학;

import java.util.Scanner;

public class q21617 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n + 1];
        int[] r = new int[n];
        double w = 0;
        for (int i = 0; i < n + 1; i++) {
            h[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            float k = (h[i] + h[i + 1]) * r[i];
            w += k / 2;
        }
        System.out.println(w);
        scan.close();
    }
}
