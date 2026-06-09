class Solution{
static void fibanocci(int n){
int a=0;
int b=1;
for(int i=0; i<n; i++){
System.out.println(a);	
	
int c=a+b;
a=b;
b=c;

}
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fibanocci(n);
}
}



