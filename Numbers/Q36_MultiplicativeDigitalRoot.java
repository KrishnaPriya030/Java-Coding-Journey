class Solution{

static void Digital_root(int n){
while(n>9){
int result=1;
while(n>0){
int rem=n%10;
result*=rem;
n=n/10;

}
n=result;
}
System.out.println(n);
}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

Digital_root(n);
}
}
