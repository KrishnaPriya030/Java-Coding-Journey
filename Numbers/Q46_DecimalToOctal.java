import java.util.Scanner;

class Solution {

    static void decimal_octal(int n) {

        if (n == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder oct = new StringBuilder();

        while (n > 0) {
            int rem = n % 8;
            oct.append(rem);
            n /= 8;
        }

        System.out.println(oct.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        decimal_octal(n);
    }
}
