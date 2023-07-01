package 수학;

import java.util.Scanner;

public class q17496 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() - 1;
        int t = scan.nextInt();
        int c = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        System.out.println((n / t) * c * p);
    }
}
