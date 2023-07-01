package 수학;

import java.util.Scanner;

public class q26767 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; i++) {
            if (i % 77 == 0) {
                System.out.println("Wiwat!");
            } else if (i % 7 == 0) {
                System.out.println("Hurra!");
            } else if (i % 11 == 0) {
                System.out.println("Super!");
            } else {
                System.out.println(i);
            }
        }
    }
}
