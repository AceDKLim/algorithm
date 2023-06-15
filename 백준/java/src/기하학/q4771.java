package 기하학;

import java.util.Scanner;

public class q4771 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String coord = new String(scan.nextLine());
            if (coord == "-1") {
                break;
            }
            String c[] = coord.split(" ");
            double x = Math.pow(Double.parseDouble(c[0]) - Double.parseDouble(c[2]), 2)
                    + Math.pow(Double.parseDouble(c[1]) - Double.parseDouble(c[3]), 2);
            double y = Math.pow(Double.parseDouble(c[2]) - Double.parseDouble(c[4]), 2)
                    + Math.pow(Double.parseDouble(c[3]) - Double.parseDouble(c[5]), 2);
            double z = Math.pow(Double.parseDouble(c[0]) - Double.parseDouble(c[4]), 2)
                    + Math.pow(Double.parseDouble(c[1]) - Double.parseDouble(c[5]), 2);
            String result = "";
            if (z > y) {
                Double n = z;
                z = y;
                y = n;
            }
            if (x < y) {
                Double n = x;
                x = y;
                y = n;
            }
            if (Math.sqrt(x) >= Math.sqrt(y) + Math.sqrt(z)) {
                result += "Not a Triangle";
            } else {
                if (x == y && y == z) {
                    result += "Equilateral";
                } else if (x == y || y == z || x == z) {
                    result += "Isosceles";
                } else {
                    result += "Scalene";
                }
                if (x == y + z) {
                    result += " Right";
                } else if (x > y + z) {
                    result += " Obtuse";
                } else if (x < y + z) {
                    result += " Acute";
                }
            }
            System.out.println(result);
        }
        scan.close();
    }
}
