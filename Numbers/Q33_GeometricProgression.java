

class Solution {

    static void geo_progression(double a, double r, int n) {

        double term = a * Math.pow(r, n - 1);

        System.out.println(term);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double r = sc.nextDouble();
        int n = sc.nextInt();

        geo_progression(a, r, n);
    }
}
