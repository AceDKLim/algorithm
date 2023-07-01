package 수학;

import java.util.Scanner;

public class q10180 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int d = scan.nextInt();
            int r = 0;
            for (int j = 0; j < n; j++) {
                float v = scan.nextFloat();
                float f = scan.nextFloat();
                float c = scan.nextFloat();
                if (v * f / c >= d) {
                    r++;
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
