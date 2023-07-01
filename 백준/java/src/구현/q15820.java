package 구현;

import java.util.Scanner;

public class q15820 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int r = 0;
        for (int i = 0; i < s1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a != b) {
                r = 1;
            }
        }
        for (int i = 0; i < s2; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a != b && r == 0) {
                r = 2;
            }
        }
        if (r == 0) {
            System.out.println("Accepted");
        } else if (r == 1) {
            System.out.println("Wrong Answer");
        } else {
            System.out.println("Why Wrong!!!");
        }
        scan.close();
    }
}
