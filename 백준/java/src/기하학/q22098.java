package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q22098 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int right = 0;
            int acute = 0;
            int obtuse = 0;
            int[] r = new int[4];
            for (int j = 0; j < 4; j++) {
                r[j] = scan.nextInt();
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int t = k + 1; t < 4; t++) {
                        int[] m = { r[j], r[k], r[t] };
                        Arrays.sort(m);
                        if (m[0] + m[1] <= m[2]) {
                            continue;
                        }
                        double a = Math.pow(m[0], 2) + Math.pow(m[1], 2);
                        double b = Math.pow(m[2], 2);
                        if (a == b) {
                            right++;
                        } else if (a < b) {
                            obtuse++;
                        } else {
                            acute++;
                        }
                    }
                }
            }
            System.out.println(right + " " + acute + " " + obtuse);
        }
        scan.close();
    }
}
