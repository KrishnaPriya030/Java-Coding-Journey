import java.util.Scanner;

class Solution {
    
    static void leap_year(int m, int n) {
        
        for (int i = m; i <= n; i++) {
            
            boolean found = false;

            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                found = true;
            }

            if (found) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        leap_year(m, n);
    }
}
