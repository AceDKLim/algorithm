package 수학;

import java.util.Scanner;

public class q6887 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        n = (int) Math.sqrt(n);
        System.out.println(String.format("The largest square has side length %d.", n));
    }
}
