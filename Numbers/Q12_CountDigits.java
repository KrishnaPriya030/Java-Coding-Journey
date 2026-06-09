class Solution{
static  void count_digits(int n){
int count=0;
while(n>0){
count++;
n=n/10;
}
System.out.println(count);
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
count_digits(n);

}
}
	


