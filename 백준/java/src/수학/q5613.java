package 수학;

import java.util.Scanner;

public class q5613 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        while (true) {
            String n = scan.next();
            if (n.equals("=")) {
                break;
            } else if (n.equals("+")) {
                r += scan.nextInt();
            } else if (n.equals("-")) {
                r -= scan.nextInt();
            } else if (n.equals("*")) {
                r *= scan.nextInt();
            } else if (n.equals("/")) {
                r /= scan.nextInt();
            }
        }
        scan.close();
        System.out.println(r);
    }
}
