package 문자열;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q20944 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scan.nextInt();
        scan.close();
        for (int i = 0; i < n; i++) {
            bw.write('a');
        }
        bw.flush();
        bw.close();
    }
}
