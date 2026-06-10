class Solution{

static void spyumber(int n){
int sum=0;
int temp=n;
while(temp>0){
int rem=temp%10;
sum+=rem;
temp = temp / 10;

}
temp=n;
int product=1;

while(temp>0){
int rem=temp%10;
product*=rem;
temp = temp / 10;
}
if(sum==product){
System.out.println("Neon number");
}
else{
System.out.println("Not neon number");
}
}


public static void main(Strig [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
spyumber(n);
}
}
