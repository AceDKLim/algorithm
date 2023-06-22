package 기하학;

import java.util.Scanner;

public class q1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = 1;
            for (int j = 0; j < b; j++) {
                n *= a;
                n %= 10;
            }
            if (n == 0) {
                System.out.println(10);
            } else {
                System.out.println(n);
            }
        }
        scan.close();
    }
}