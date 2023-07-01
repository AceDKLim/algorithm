package 수학;

import java.util.Scanner;

public class q15025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Not a moose");
        } else if (a == b) {
            System.out.println("Even " + (a * 2));
        } else if (a > b) {
            System.out.println("Odd " + (a * 2));
        } else {
            System.out.println("Odd " + (b * 2));
        }
        scan.close();
    }
}
