class Solution{
static  void sum_digits(int n){
int sum=0;
while(n>0){
int rem=n%10;
sum+=rem;
n=n/10;
}
System.out.println(sum);
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sum_digits(n);

}
}
	




