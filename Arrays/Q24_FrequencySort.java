import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Integer[] is required because Arrays.sort() with Comparator
        // works on objects, not primitive int[]
        Integer[] arr = new Integer[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort by increasing frequency
        Arrays.sort(arr, (a, b) -> {

            // If frequencies are different
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b);
            }

            // If frequencies are the same,
            // place the larger number first
            return b - a;
        });

        // Step 3: Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
