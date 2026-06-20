import java.util.*;
class Solution {
    public List<Integer> findNonrepeat(int[] nums) {
        List <Integer> result=new ArrayList<>();
        
       HashMap<Integer,Integer> freq=new HashMap<>();
        
       for(int num:nums){

        freq.put(num,freq.getOrDefault(num,0)+1);
        
       }
        for (int num:nums){
    
    
       if(freq.get(num)==1){

            result.add(num);

       }
        }
        return result;
    }
}
