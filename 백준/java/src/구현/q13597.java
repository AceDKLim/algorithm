package 구현;

import java.util.Scanner;

public class q13597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        scan.close();
    }
}
