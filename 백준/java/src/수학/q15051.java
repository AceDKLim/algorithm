package 수학;

import java.util.Scanner;

public class q15051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int x = b * 2 + c * 4;
        int y = a * 2 + c * 2;
        int z = a * 4 + b * 2;
        System.out.println(Math.min(x, Math.min(y, z)));
    }
}
