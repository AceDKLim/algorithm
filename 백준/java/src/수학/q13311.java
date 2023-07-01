package 수학;

public class q13311 {
    public static void main(String[] args) {
        long n = 2;
        for (int i = 2; i <= 1000; i++) {
            n = n * i / gcd(i, n);
        }
        System.out.println(n - 1);
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
