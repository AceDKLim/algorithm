package 구현;

import java.util.Arrays;
import java.util.Scanner;

public class q26350 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = scan.nextInt();
            }
            Arrays.sort(m);
            boolean r = true;
            System.out.print("Denominations: ");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(m[j] + " ");
                if (m[j] * 2 > m[j + 1]) {
                    r = false;
                }
            }
            System.out.println(m[n - 1]);
            if (r) {
                System.out.println("Good coin denominations!");
            } else {
                System.out.println("Bad coin denominations! ");
            }
            System.out.println();
        }
        scan.close();
    }
}
