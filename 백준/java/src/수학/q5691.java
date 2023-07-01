package 수학;

import java.util.Scanner;

public class q5691 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(3 * a - (a + b));
        }
        scan.close();
    }
}
