import java.util.Scanner;

class Solution {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static int nearestPrime(int n) {
        if (isPrime(n)) return n;

        int left = n - 1;
        int right = n + 1;

        while (true) {
            if (left >= 2 && isPrime(left))
                return left; // smaller prime chosen in tie

            if (isPrime(right))
                return right;

            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(nearestPrime(n));

        sc.close();
    }
}
