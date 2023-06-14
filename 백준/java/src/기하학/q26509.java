package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q26509 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double t1[] = new double[3];
            double t2[] = new double[3];
            for (int j = 0; j < 3; j++) {
                t1[j] = scan.nextDouble();
            }
            for (int j = 0; j < 3; j++) {
                t2[j] = scan.nextDouble();
            }
            Arrays.sort(t1);
            Arrays.sort(t2);
            double s1 = Math.sqrt(Math.pow(t1[0], 2) + Math.pow(t1[1], 2));
            double s2 = Math.sqrt(Math.pow(t2[0], 2) + Math.pow(t2[1], 2));

            boolean l = true;
            for (int j = 0; j < 3; j++) {
                if (t1[j] != t2[j]) {
                    l = false;
                    break;
                }
            }

            if (l == false) {
                System.out.println("NO");
            } else if (s1 != t1[2] || s2 != t2[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scan.close();
    }
}
