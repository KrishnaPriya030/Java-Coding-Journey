class Solution{

static void count_bits(int n){

int count=0;
while(n>0){
n=n & (n-1);
count++;
}
System.out.println(count);



}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

count_bits(n);
}
}
