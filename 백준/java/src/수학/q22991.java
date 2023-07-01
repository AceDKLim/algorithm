package 수학;

import java.util.Scanner;

public class q22991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = 0;
        for (int i = 0; i < 3; i++) {
            int n = scan.nextInt();
            r += (n * n * n);
        }
        System.out.println(Math.pow(r, (1 / 3)));
        scan.close();
    }
}
