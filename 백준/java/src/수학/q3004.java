package 수학;

import java.util.Scanner;

public class q3004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            if ((a + 1) * b > a * (b + 1)) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a * b);
    }
}
