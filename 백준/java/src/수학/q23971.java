package 수학;

import java.util.Scanner;

public class q23971 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        int a = h % (n + 1) == 0 ? h / (n + 1) : h / (n + 1) + 1;
        int b = w % (m + 1) == 0 ? w / (m + 1) : w / (m + 1) + 1;
        System.out.println(a * b);
    }
}
