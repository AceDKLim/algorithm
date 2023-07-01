package 수학;

import java.util.Scanner;

public class q10179 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double t = scan.nextDouble();
            System.out.printf("$%.2f\n", t * 0.8);
        }
        scan.close();
    }
}
