package 구현;

import java.util.Scanner;

public class q27159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int r = Integer.parseInt(s[0]);
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(s[i - 1]);
            int b = Integer.parseInt(s[i]);
            if (b - a != 1) {
                r += b;
            }
        }
        System.out.println(r);
        scan.close();
    }
}
