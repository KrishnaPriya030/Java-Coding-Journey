import java.util.Scanner;
import java.util.Arrays;
class Solution{
static void prime_Check_till_N(int n){

  if (n < 2) {
        return;
    }
boolean [] arr=new boolean [n+1];
Arrays.fill(arr,true);
arr[0]=false;
arr[1]=false;
for(int i=2;i<arr.length; i++){
if(arr[i]==true){
for(int j=i*i; j<arr.length; j+=i){
arr[j]=false;
}
}
} 
for(int i=2;i<arr.length; i++){
if(arr[i]==true){
System.out.println(i+" ");
}
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

prime_Check_till_N(n);
}
}

