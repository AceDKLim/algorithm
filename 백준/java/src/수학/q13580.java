package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class q13580 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] t = new int[3];
        for (int i = 0; i < 3; i++) {
            t[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(t);
        if (t[0] == t[1] || t[0] == t[2] || t[1] == t[2]) {
            System.out.println("S");
        } else if (t[0] + t[1] == t[2]) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
