import java.util.Scanner;

class Solution {

    static void interest(double p, double n, double r) {

        double simple_interest = (p * n * r) / 100;

        System.out.printf("%.2f", simple_interest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double n = sc.nextDouble();
        double r = sc.nextDouble();

        interest(p, n, r);
    }
}
