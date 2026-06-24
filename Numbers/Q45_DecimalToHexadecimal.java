import java.util.Scanner;

class Solution {

    static void decimal_hexadecimal(int n) {

        if (n == 0) {
            System.out.println("0");
            return;
        }

        String digits = "0123456789ABCDEF";
        StringBuilder hex = new StringBuilder();

        while (n > 0) {
            int rem = n % 16;
            hex.append(digits.charAt(rem));
            n /= 16;
        }

        System.out.println(hex.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        decimal_hexadecimal(n);
    }
}
