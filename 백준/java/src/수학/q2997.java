package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q2997 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(n);
        if (n[1] - n[0] == n[2] - n[1]) {
            System.out.println(n[2] + n[1] - n[0]);
        } else if (2 * (n[1] - n[0]) == n[2] - n[1]) {
            System.out.println(n[2] - n[1] + n[0]);
        } else {
            System.out.println(n[0] + n[2] - n[1]);
        }
    }
}
