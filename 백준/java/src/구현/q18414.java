package 구현;

import java.util.Scanner;

public class q18414 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int n = l <= x && x <= r ? x : x < l ? l : r;
        System.out.println(n);
        scan.close();
    }
}
