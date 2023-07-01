package 수학;

import java.util.Scanner;

public class q19602 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        int r = 1 * s + 2 * m + 3 * l;
        if (r >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
        scan.close();
    }
}
