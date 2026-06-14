import java.util.Scanner;

class Solution {

    static void interest(double p, double n, double r) {

        double compoundinterest = p * Math.pow(1 + (r / 100), n) - p;

        System.out.printf("%.2f", compoundinterest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double n = sc.nextDouble();
        double r = sc.nextDouble();

        interest(p, n, r);
    }
}
