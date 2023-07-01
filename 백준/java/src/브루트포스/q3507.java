package 브루트포스;

import java.util.Scanner;

public class q3507 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 0;
        for (int i = 0; i < 100; i++) {
            if ((n - i) / 100 == 0) {
                r++;
            }
        }
        System.out.println(r);
    }
}
