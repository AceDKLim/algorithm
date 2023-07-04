package 수학;

import java.util.Scanner;

public class q11258 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = new String[6];
        int[] m = new int[6];
        for (int i = 0; i < 6; i++) {
            n[i] = scan.next();
            m[i] = scan.nextInt();
        }
        while (true) {
            String t = scan.next();
            if (t.equals("-1")) {
                break;
            }
            String a = t.substring(0, 3);
            String b = t.substring(3, 6);
            String c = t.substring(4, 6);
            int r = 0;
            String[] q = { t, a, a, b, b, c };
            for (int i = 0; i < 6; i++) {
                if (n[i].equals(q[i])) {
                    r += m[i];
                }
            }
            System.out.println(r);
        }
        scan.close();
    }
}
