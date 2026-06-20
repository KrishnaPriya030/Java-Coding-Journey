import java.util.*;
class Solution{

    static void bubble_sort(int [] arr){
       

for(int i=0; i<arr.length-1; i++){
   for(int j=0; j<arr.length-1-i; j++)
    if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

    }

    
   
}
    }

    
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.   nextInt();
        int [] arr=new int[n];
        // end index

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubble_sort(arr);
       for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
} 
    }
}
