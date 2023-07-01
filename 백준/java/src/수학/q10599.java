package 수학;

import java.util.Scanner;

public class q10599 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            } else {
                System.out.println((c - b) + " " + (d - a));
            }
        }
        scan.close();
    }
}
