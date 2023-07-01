package 수학;

import java.util.Scanner;

public class q16673 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int k = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        int s = 0;
        for (int i = 1; i <= c; i++) {
            s += i * k + i * i * p;
        }
        System.out.println(s);
    }
}
