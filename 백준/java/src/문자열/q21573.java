package 문자열;

import java.util.Scanner;

public class q21573 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        String m = scan.next();
        scan.close();
        if (m.equals("fan")) {
            System.out.println(t1);
        } else if (m.equals("auto")) {
            System.out.println(t2);
        } else if (m.equals("freeze")) {
            if (t1 >= t2) {
                System.out.println(t2);
            } else {
                System.out.println(t1);
            }
        } else if (m.equals("heat")) {
            if (t1 <= t2) {
                System.out.println(t2);
            } else {
                System.out.println(t1);
            }
        }
    }
}
