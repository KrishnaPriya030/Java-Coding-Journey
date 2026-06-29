import java.util.*;

class Solution {

    static void rotate(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rotate_right(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        // Step 1: Reverse the entire array
        rotate(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        rotate(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        rotate(arr, k, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate_right(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
