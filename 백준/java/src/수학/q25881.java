package 수학;

import java.util.Scanner;

public class q25881 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int s = 0;
            int t = scan.nextInt();
            if (t > 1000) {
                s += a * 1000;
                s += (t - 1000) * b;
            } else {
                s = a * t;
            }
            System.out.println(t + " " + s);
        }
        scan.close();
    }
}
