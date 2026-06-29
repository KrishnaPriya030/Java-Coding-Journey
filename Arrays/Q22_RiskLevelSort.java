import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read the number of items
        int n = sc.nextInt();

        // Step 2: Take string array input
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Step 3: Count Low, Medium, and High
        int low = 0;
        int medium = 0;
        int high = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i].equals("Low")) {
                low++;
            }
            else if (arr[i].equals("Medium")) {
                medium++;
            }
            else if (arr[i].equals("High")) {
                high++;
            }
        }

        // Step 4: Print in order
        for (int i = 0; i < low; i++)
            System.out.println("Low");

        for (int i = 0; i < medium; i++)
            System.out.println("Medium");

        for (int i = 0; i < high; i++)
            System.out.println("High");

        sc.close();
    }
}
