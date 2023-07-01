package 수학;

import java.util.Scanner;

public class q14682 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 0; i <= k; i++) {
            r += n * Math.pow(10, i);
        }
        System.out.println(r);
    }
}
