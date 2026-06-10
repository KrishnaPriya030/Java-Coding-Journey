class Solution{

static void Neon_number(int n){
int sqr=n*n;
int temp=sqr;
int result=0;
while(temp>0){
int rem=temp%10;
result+=rem;
temp=temp/10;
}
if(result==n){
System.out.println("Neon number");
}
else{

System.out.println("Not neon number");
}
}
public static void main(Strig [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Neon_number(n);
}
}

