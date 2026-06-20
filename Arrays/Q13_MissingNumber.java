import java.util.*;
class Solution{

    static int missing_number(int [] arr){


        int n=arr.length+1;
        int expected_sum=n*(n+1)/2;
        int sum=0;
        


        for(int i=0; i<arr.length; i++){

            sum+=arr[i];
        }
     int missing_number=expected_sum-sum;

     return missing_number;
        
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(missing_number(arr));
}
}
