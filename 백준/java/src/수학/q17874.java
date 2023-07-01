package 수학;

import java.util.Scanner;

public class q17874 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int v = scan.nextInt();
        int a = h < n - h ? n - h : h;
        int b = v < n - v ? n - v : v;
        System.out.println(a * b * 4);
        scan.close();
    }
}
