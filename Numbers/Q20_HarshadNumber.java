class Solution{

static void Harshad(int n){
int temp=n;
int rem;
int result=0;
while(temp>0){
rem=temp%10;
result+=rem;
temp=temp/10;
}
if(n%result==0){
System.out.println("Harshad number");
}
else{
System.out.println("Not Harshad number");
}
}

public static void main(Strig [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Harshad(n);
}
}
