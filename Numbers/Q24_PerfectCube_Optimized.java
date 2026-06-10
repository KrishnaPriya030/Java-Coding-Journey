class Solution {

    static void Perfect_cube(int n) {

        int root = (int) Math.cbrt(n);

        if (root * root * root == n) {
            System.out.println("Perfect Cube");
        } else {
            System.out.println("Not Perfect Cube");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Perfect_cube(n);
    }
}
