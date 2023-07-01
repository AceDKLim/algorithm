package 수학;

import java.util.Scanner;

public class q11134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int c = scan.nextInt();
            int r = n % c == 0 ? n / c : n / c + 1;
            System.out.println(r);
        }
        scan.close();
    }
}
