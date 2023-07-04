package 수학;

import java.util.Scanner;

public class q21022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] a = scan.nextLine().split(" ");
        String[] b = scan.nextLine().split(" ");
        scan.close();
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                r += 3;
            } else if (Integer.parseInt(a[i]) == Integer.parseInt(b[i])) {
                r += 1;
            }
        }
        System.out.println(r);
    }
}
