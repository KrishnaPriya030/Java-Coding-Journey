class Solution{
static void perfect_sqr_check(int n){
int root=(int)Math.sqrt(n);
if(root*root==n){
System.out.println("Perfect Square");
}
else{
System.out.println("Not Perfect Square");

}
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
perfect_sqr_check(n);
}
}
