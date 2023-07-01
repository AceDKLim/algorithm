package 수학;

import java.util.Scanner;

public class q10698 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= t; i++) {
            String[] n = scan.nextLine().split(" ");
            int r = n[1].equals("+") ? Integer.parseInt(n[0]) + Integer.parseInt(n[2])
                    : Integer.parseInt(n[0]) - Integer.parseInt(n[2]);
            if (r == Integer.parseInt(n[4])) {
                System.out.printf("Case %d: YES\n", i);
            } else {
                System.out.printf("Case %d: NO\n", i);
            }
        }
        scan.close();
    }
}
