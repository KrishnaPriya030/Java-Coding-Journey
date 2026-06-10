class Solution{

static void Abundant_number(int n){
int sum=0;

for(int i=1; i<n; i++){
if(n%i==0){
sum+=i;
}
}
if(sum>n){
System.out.println("abundant number");
}
else{
System.out.println("Not abundant number");
}
}



public static void main(String []args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Abundant_number(n);
}
}
