package 수학;

import java.util.Scanner;

public class q24087 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int r = 250;
        s -= a;
        int n = s % b == 0 ? s / b : s / b + 1;
        r += n * 100;
        r = s > 0 ? r : 250;
        System.out.println(r);
    }
}
