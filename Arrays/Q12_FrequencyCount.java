import java.util.*;
class Solution {
    public void findfrequency(int[] nums) {
        
        
       HashMap<Integer,Integer> freq=new HashMap<>();
        
       for(int num:nums){

        freq.put(num,freq.getOrDefault(num,0)+1);
        
       }
       
       for(Map.Entry<Integer,Integer>entry : freq.entrySet()){

        System.out.println(entry.getKey() +"->"+entry.getValue());
       }
       
      
}
}
find dirst non repeat  element

import java.util.*;

class Solution {

    static int firstNonRepeating(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first non-repeating element
        for (int num : nums) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1; // No non-repeating element
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 2, 3, 5};

        System.out.println(firstNonRepeating(nums));
    }
}

3.First repeating element
    import java.util.*;

class Solution {

    static int firstRepeating(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (freq.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }
}
4.Element with maximum frequency 

    import java.util.*;

class Solution {

    static int maxFrequency(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }
}

4.Elmnet with minimum frequency

    import java.util.*;

class Solution {

    static int minFrequency(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if (entry.getValue() < min) {
                min = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }
}
