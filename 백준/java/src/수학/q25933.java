package 수학;

import java.util.Scanner;

public class q25933 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int[] m = new int[6];
            for (int j = 0; j < 6; j++) {
                m[j] = scan.nextInt();
            }
            boolean c = false;
            boolean g = false;
            if (m[0] + m[1] + m[2] > m[3] + m[4] + m[5]) {
                c = true;
            }
            for (int j = 0; j < 3; j++) {
                if (m[j] > m[j + 3]) {
                    g = true;
                    break;
                } else if (m[j] < m[j + 3]) {
                    break;
                }
            }
            String r = c == true && g == true ? "both"
                    : c == true && g == false ? "count" : c == false && g == true ? "color" : "none";
            for (int j = 0; j < 6; j++) {
                System.out.print(m[j] + " ");
            }
            System.out.println();
            System.out.println(r);
            System.out.println();
        }
        scan.close();
    }
}
