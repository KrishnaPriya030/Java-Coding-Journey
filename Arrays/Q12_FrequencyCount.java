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
