package 기하학;

import java.util.Arrays;
import java.util.Scanner;

public class q11596 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tri1 = new int[3];
        int[] tri2 = new int[3];
        for (int i = 0; i < 3; i++) {
            tri1[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            tri2[i] = scan.nextInt();
        }

        Arrays.sort(tri1);
        Arrays.sort(tri2);

        String result = "YES";
        for (int i = 0; i < 3; i++) {
            if (tri1[i] != tri2[i]) {
                result = "NO";
                break;
            }
        }

        if (tri1[0] + tri1[1] <= tri1[2]) {
            result = "NO";
        }

        int a = tri1[0] * tri1[0];
        int b = tri1[1] * tri1[1];
        int c = tri1[2] * tri1[2];
        if (a + b != c) {
            result = "NO";
        }

        System.out.println(result);
        scan.close();
    }
}