package 수학;

import java.util.Scanner;

public class q16239 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        for (int i = 1; i < k; i++) {
            System.out.println(i);
            n -= i;
        }
        System.out.println(n);
    }
}
