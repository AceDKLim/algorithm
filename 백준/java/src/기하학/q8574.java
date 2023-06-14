package 기하학;

import java.util.Scanner;

public class q8574 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        double x = scan.nextInt();
        double y = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            double a = scan.nextInt();
            double b = scan.nextInt();
            double d = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
            if (d > k) {
                cnt++;
            }
        }
        System.out.println(cnt);
        scan.close();
    }
}
