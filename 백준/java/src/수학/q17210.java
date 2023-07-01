package 수학;

import java.util.Scanner;

public class q17210 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int a = scan.nextInt();
        scan.close();
        int b = a == 0 ? 1 : 0;
        if (n >= 6) {
            System.out.println("Love is open door");
        } else {
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }
        }
    }
}
