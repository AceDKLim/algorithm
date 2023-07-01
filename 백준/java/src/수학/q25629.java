package 수학;

import java.util.Scanner;

public class q25629 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (scan.nextInt() % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        scan.close();
        if (odd - even == 1 || odd - even == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
