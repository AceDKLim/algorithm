package 수학;

import java.util.Scanner;

public class q25828 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int g = scan.nextInt();
        int p = scan.nextInt();
        int t = scan.nextInt();
        scan.close();
        int x = g * p;
        int y = g + p * t;
        if (x > y) {
            System.out.println(2);
        } else if (x < y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
