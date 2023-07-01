package 수학;

import java.util.Scanner;

public class q28224 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            r += scan.nextInt();
        }
        System.out.println(r);
        scan.close();
    }
}
