package 수학;

import java.util.Scanner;

public class q27213 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println(m * n - (Math.max((m - 2), 0) * Math.max((n - 2), 0)));
    }
}
