package 구현;

import java.util.Scanner;

public class q20361 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n = n + 1;
        int x = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == x) {
                x = b;
            } else if (b == x) {
                x = a;
            }
        }
        scan.close();
        System.out.println(x);
    }
}
