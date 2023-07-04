package 브루트포스;

import java.util.Scanner;

public class q26941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int c = 0;
        int i = 1;
        while (n >= 0) {
            n -= i * i;
            i += 2;
            c++;
        }
        if (n != 1) {
            c--;
        }
        System.out.println(c);
    }
}
