package 수학;

import java.util.Scanner;

public class q27332 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        a += 7 * scan.nextInt();
        scan.close();
        if (a > 30) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
