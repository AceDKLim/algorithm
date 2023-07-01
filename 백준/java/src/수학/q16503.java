package 수학;

import java.util.Scanner;

public class q16503 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[2]);
        int z = Integer.parseInt(s[4]);
        int a = 0;
        int b = 0;
        if (s[1].equals("+")) {
            a = x + y;
        } else if (s[1].equals("-")) {
            a = x - y;
        } else if (s[1].equals("*")) {
            a = x * y;
        } else if (s[1].equals("/")) {
            a = x / y;
        }

        if (s[3].equals("+")) {
            a += z;
            b = y + z;
        } else if (s[3].equals("-")) {
            a -= z;
            b = y - z;
        } else if (s[3].equals("*")) {
            a *= z;
            b = y * z;
        } else if (s[3].equals("/")) {
            a /= z;
            b = y / z;
        }

        if (s[1].equals("+")) {
            b = x + b;
        } else if (s[1].equals("-")) {
            b = x - b;
        } else if (s[1].equals("*")) {
            b = x * b;
        } else if (s[1].equals("/")) {
            b = x / b;
        }

        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
