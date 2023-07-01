package 수학;

import java.util.Scanner;

public class q13484 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int r = x;
        for (int i = 0; i < n; i++) {
            r += x - scan.nextInt();
        }
        scan.close();
        System.out.println(r);
    }
}
