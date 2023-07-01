package 수학;

import java.util.Scanner;

public class q16504 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r += scan.nextDouble();
            }
        }
        scan.close();
        System.out.println(r);
    }
}
