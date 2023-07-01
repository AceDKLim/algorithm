package 구현;

import java.util.Scanner;

public class q27736 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int a = 0;
        int r = 0;
        int i = 0;
        for (String j : s) {
            if (j.equals("1")) {
                a++;
            } else if (j.equals("-1")) {
                r++;
            } else {
                i++;
            }
        }
        if (i * 2 >= n) {
            System.out.println("INVALID");
        } else if (a > r) {
            System.out.println("APPROVED");
        } else {
            System.out.println("REJECTED");
        }
    }
}
