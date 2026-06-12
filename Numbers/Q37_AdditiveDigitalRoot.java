import java.util.Scanner;

class Solution {

    static void Digital_root(int n) {

        while (n > 9) {

            int sum = 0;

            while (n > 0) {

                int rem = n % 10;

                sum += rem;

                n = n / 10;
            }

            n = sum;
        }

        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Digital_root(n);
    }
}
