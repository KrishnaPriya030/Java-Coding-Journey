import java.util.Scanner;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List <Integer> result=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
     
        for(int i=0; i<nums.length; i++){

           if(!set.add(nums[i])){

                    result.add(nums[i]);
                }
            }
             return result;

        }
       
    }

import java.util.*;
class Solution{
    static List<Integer> duplicates_array(int [] arr){
        List <Integer> result=new ArrayList<>();
        for(int i=0; i<arr.length; i++){

    int index=Math.abs(arr[i])-1;

    if(arr[index]<0){
        result.add(index+1);
    }
            else{
            
    arr[index]=arr[index]*(-1);
            

        }
        }
                return result;
    }
}
    
        
