class Solution{

static void decimal_to_binary(int n){
int result=0;
int place=1;
while(n>0){
int rem=n%2;
result=result*rem + place;
place=place*10;
n=n/2;
}
System.out.println(result);
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

decimal_to_binary(n);
}
}
