class Solution{

static void decimal_hexadecimal(int n){

String hex="";
String hexdigits="0123456789ABCDEF";
if(n==0){
System.out.println("0");
return;
}
while(n>0){
int rem=n%16;
hex=hexdigits.charAt(rem)+hex;
n=n/16;
}

System.out.println(hex);
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
decimal_hexadecimal(n);
}
}
