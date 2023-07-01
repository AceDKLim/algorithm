package 수학;

import java.util.Scanner;

public class q6768 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int r = 1;
        for (int i = 1; i <= 3; i++) {
            r *= n - i;
            r /= i;
        }
        System.out.println(r);
    }
}
