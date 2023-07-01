package 구현;

import java.util.Scanner;

public class q24072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int r = a <= c && c < b ? 1 : 0;
        System.out.println(r);
    }
}
