package 수학;

import java.util.Scanner;

public class q24083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int t = a + b;
        t %= 12;
        if (t == 0) {
            System.out.println(12);
        } else {
            System.out.println(t);
        }
    }
}
