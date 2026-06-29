
class Solution{
static void rotate(int [] arr,int start,int end){
while(start<end){

int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;

start++;
end--;
}
}
static void rotate_left(int [] arr,int k){

int n=arr.length;
k=k%n;
rotate(arr,0,k-1);
rotate(arr,k,n-1);
rotate(arr,0,n-1);

}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0; i<n; i++){
arr[i]=sc.nextInt();
}
int k=sc.nextInt();

rotate_left(arr,k);
for(int i=0; i<n; i++){
System.out.println(arr[i]);
}
}
}


