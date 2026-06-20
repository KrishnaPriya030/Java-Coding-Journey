import java.util.*;
class Solution{

    static String sorted_descending(int [] arr){
       

for(int i=0; i<arr.length-1; i++){
   
    if(arr[i]<arr[i+1]){

        return "Not Sorted";
    }
    
   }
    return "Sorted";
}

    
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.   nextInt();
        int [] arr=new int[n];
        // end index

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         
       System.out.println(sorted_descending(arr));
    }
}
