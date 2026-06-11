class Solution{

static void binary_to_decimal(int n){

int power=0;
int result=0;
while(n>0){
int rem=n%10;
result+=rem * (int)Math.pow(2, power);
power++;
n=n/10;
}
System.out.println(result);
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

binary_to_decimal(n);
}
}
