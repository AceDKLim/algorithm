package 수학;

import java.util.Scanner;

public class q14935 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        boolean r = false;
        for (int i = 0; i < 100; i++) {
            int l = x.length();
            int f = Integer.valueOf(x.charAt(0));
            String n = Integer.toString(l * f);
            if (n.equals(x)) {
                r = true;
                break;
            }
            x = n;
        }
        if (r == false) {
            System.out.println("NFA");
        } else {
            System.out.println("FA");
        }
        scan.close();
    }
}
