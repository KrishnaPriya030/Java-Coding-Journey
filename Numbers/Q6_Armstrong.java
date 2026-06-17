import java.util.Scanner;

class Solution {

    static void armstrong(int n) {

        int temp = n;
        int result = 0;
        int digits = 0;

        while(temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while(temp != 0) {
            int rem = temp % 10;
            result += (int)Math.pow(rem, digits);
            temp = temp / 10;
        }

        if(n == result) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        armstrong(n);
    }
}
