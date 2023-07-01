package 수학;

import java.util.Scanner;

public class q17284 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        scan.close();
        int n = 5000;
        for (String i : s) {
            if (i.equals("1")) {
                n -= 500;
            } else if (i.equals("2")) {
                n -= 800;
            } else {
                n -= 1000;
            }
        }
        System.out.println(n);
    }
}
