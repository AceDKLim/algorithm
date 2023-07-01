package 구현;

import java.util.Scanner;

public class q13623 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        if (a == b && b == c) {
            System.out.println('*');
        } else if (a == b) {
            System.out.println('C');
        } else if (b == c) {
            System.out.println('A');
        } else {
            System.out.println('B');
        }
    }
}
