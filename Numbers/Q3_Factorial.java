import java.util.Scanner;

class Solution {
static long fact(long n) {
    long fact = 1;

    for (long i = 2; i <= n; i++) {
        fact *= i;
    }

    return fact;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(fact(n));

        sc.close();
    }
}
