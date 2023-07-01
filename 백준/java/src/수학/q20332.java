package 수학;

import java.util.Scanner;

public class q20332 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            r += scan.nextInt();
        }
        scan.close();
        if (r % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
