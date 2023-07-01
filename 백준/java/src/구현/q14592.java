package 구현;

import java.util.Scanner;

public class q14592 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] r = { 0, 0, 0, 0 };
        for (int i = 0; i < n; i++) {
            int[] t = new int[4];
            for (int j = 0; j < 3; j++) {
                t[j] = scan.nextInt();
            }
            t[3] = i + 1;
            if (r[0] < t[0]) {
                r = t;
            } else if (r[0] == t[0]) {
                if (r[1] > t[1]) {
                    r = t;
                } else if (r[1] == t[1]) {
                    if (r[2] > t[2]) {
                        r = t;
                    }
                }
            }
        }
        System.out.println(r[3]);
        scan.close();
    }
}
