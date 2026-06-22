import java.util.Scanner;
class Solution{

static void Automorphic_number(int n){
int sqr=n*n;
int temp=n;
while(temp!=0){

if(temp%10!=sqr%10){
System.out.println("Not amorphic");
return;
}
temp=temp/10;
sqr=sqr/10;
}
System.out.println("amorphic");
}


public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Automorphic_number(n);
}
}
