import java.util.Scanner;

class Solution{
static  void lcm(int a,int b){
int org_a=a;
int org_b=b;

while(b!=0){
int temp=b;
b=a%b;
a=temp;
}
int gcd=a;
int lcm=( org_a * org_b)/gcd ;
System.out.println(lcm);

}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
lcm(a,b);
}
}
	




