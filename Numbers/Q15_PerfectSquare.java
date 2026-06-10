class Solution{
static void perfect_sqr_check(int n){
boolean found=false;
for(int i=1; i*i<=n; i++){
if(i*i==n){
found=true;
break;
}
}
if(found){
System.out.println("Perfect Number");
}
else{
System.out.println("Not Perfect Number");

}
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
perfect_sqr_check(n);
}
}
