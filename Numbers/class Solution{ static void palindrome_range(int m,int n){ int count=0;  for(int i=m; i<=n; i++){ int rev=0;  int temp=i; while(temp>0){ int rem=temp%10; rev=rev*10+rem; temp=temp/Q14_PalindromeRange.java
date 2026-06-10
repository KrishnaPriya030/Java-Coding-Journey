class Solution{
static void palindrome_range(int m,int n){
int count=0;

for(int i=m; i<=n; i++){
int rev=0;

int temp=i;
while(temp>0){
int rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(rev==i){
count++;

}
}
System.out.println(count);
}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int m=sc.nextInt();

int n=sc.nextInt();
palindrome_range(m,n);
}
}
