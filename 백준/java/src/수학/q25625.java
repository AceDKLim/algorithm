package 수학;

import java.util.Scanner;

public class q25625 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        if (x < y) {
            System.out.println(y % x);
        } else {
            System.out.println(x + y);
        }
    }
}
