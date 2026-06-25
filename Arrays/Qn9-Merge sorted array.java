import java.util.Scanner;

class Solution {

    static void merge_sorted_array(int[] nums1, int[] nums2, int m, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge_sorted_array(nums1, nums2, m, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
