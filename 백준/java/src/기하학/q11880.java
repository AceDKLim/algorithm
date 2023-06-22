package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q11880 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextInt();
        for (long i = 0; i < t; i++) {
            long r[] = new long[3];
            for (int j = 0; j < 3; j++) {
                r[j] = scan.nextInt();
            }
            Arrays.sort(r);
            long a = (long) (Math.pow(r[2], 2));
            long b = (long) (Math.pow(r[0] + r[1], 2));
            System.out.println(a + b);
        }
        scan.close();
    }
}
