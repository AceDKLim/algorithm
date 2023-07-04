package 수학;

import java.util.Scanner;

public class q7581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int[] cube = new int[4];
            int k = 0;
            int s = 1;
            for (int i = 0; i < 4; i++) {
                cube[i] = scan.nextInt();
                if (cube[i] == 0) {
                    k = i;
                } else {
                    s *= cube[i];
                }
            }
            if (cube[0] == 0 && cube[1] == 0) {
                break;
            }
            if (k == 3) {
                cube[3] = s;
            } else {
                s /= cube[3];
                cube[k] = cube[3] / s;
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(cube[i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}