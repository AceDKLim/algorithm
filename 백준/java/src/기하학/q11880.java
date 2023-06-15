package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q11880 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            double r[] = new double[3];
            for (int j = 0; j < 3; j++) {
                r[j] = scan.nextDouble();
            }
            Arrays.sort(r);
            System.out.println((Math.pow(r[0] + r[1], 2) + Math.pow(r[2], 2)));
        }
        scan.close();
    }
}
