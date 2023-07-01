package 수학;

import java.util.Scanner;

public class q2083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r += i * i * i;
        }
        System.out.println(r);
    }
}
