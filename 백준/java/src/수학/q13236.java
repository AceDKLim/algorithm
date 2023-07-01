package 수학;

import java.util.Scanner;

public class q13236 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n += 1;
            }
        }
        System.out.println(1);
    }
}
