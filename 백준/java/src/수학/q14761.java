package 수학;

import java.util.Scanner;

public class q14761 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        int z = y % x == 0 ? y : x * y;
        for (int i = 1; i <= n; i++) {
            String s = i % z == 0 ? "FizzBuzz" : i % x == 0 ? "Fizz" : i % y == 0 ? "Buzz" : Integer.toString(i);
            System.out.println(s);
        }
    }
}
