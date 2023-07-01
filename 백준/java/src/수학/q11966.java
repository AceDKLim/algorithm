package 수학;

import java.util.Scanner;

public class q11966 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < 31; i++) {
            int t = (int) Math.pow(2, i);
            if (t == n) {
                System.out.println(1);
                break;
            } else if (n < t) {
                System.out.println(0);
                break;
            }
        }
    }
}
