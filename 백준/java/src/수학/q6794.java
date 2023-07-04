package 수학;

import java.util.Scanner;

public class q6794 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                if (i + j == n) {
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}
