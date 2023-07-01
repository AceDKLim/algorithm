package 수학;

import java.util.Scanner;

public class q18330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        if (k + 60 > n) {
            System.out.println(n * 1500);
        } else {
            System.out.println(((k + 60) * 1500) + ((n - k - 60) * 3000));
        }
    }
}
