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
