package 구현;

import java.util.Scanner;

public class q18408 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = 0;
        int two = 0;
        for (int i = 0; i < 3; i++) {
            int n = scan.nextInt();
            if (n == 1) {
                one++;
            } else {
                two++;
            }
        }
        if (one > two) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        scan.close();
    }
}
