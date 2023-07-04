package 구현;

import java.util.Scanner;

public class q26940 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            int t = scan.nextInt();
            if (t > r) {
                c++;
            }
            r = t;
        }
        System.out.println(c);
        scan.close();
    }
}
