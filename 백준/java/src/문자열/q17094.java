package 문자열;

import java.util.Scanner;

public class q17094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        int e = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'e') {
                e++;
            } else {
                t++;
            }
        }
        if (e == t) {
            System.out.println("yee");
        } else if (e > t) {
            System.out.println("e");
        } else {
            System.out.println(2);
        }
    }
}
