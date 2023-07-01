package 수학;

import java.util.Scanner;

public class q14920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int cnt = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
