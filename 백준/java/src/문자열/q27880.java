package 문자열;

import java.util.Scanner;

public class q27880 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = 0;
        for (int i = 0; i < 4; i++) {
            String s = scan.next();
            int n = scan.nextInt();
            if (s.equals("Es")) {
                r += n * 21;
            } else {
                r += n * 17;
            }
        }
        scan.close();
        System.out.println(r);
    }
}
