import java.util.*;
class Solution{

    static int sum(int [] arr,int n,int m,int o){
        if(m<0 || o>=arr.length || m>o){
        System.out.println("Invalid range");
        return -1;
    }

int sum=0;


for(int i=m; i<=o; i++){
   sum+=arr[i];
}
return sum;
    }
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        // end index

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt(); // start index
        int o = sc.nextInt(); 
       System.out.println(sum(arr,n,m,o));
    }
}
