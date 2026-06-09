class Solution{
static int nth_fibanocci(int n){
int a=0;
int b=1;
for(int i=0; i<n; i++){
int c=a+b;
a=b;
b=c;

}
return a;


}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(nth_fibanocci(n));
}
}

