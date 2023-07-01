package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q25784 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(n);
        if (n[0] + n[1] == n[2]) {
            System.out.println(1);
        } else if (n[0] * n[1] == n[2]) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
